package isp.lab5.exercise3;

interface Playable {
    void play();
}

class ColorVideo implements Playable {

    private String fileName;

    public ColorVideo(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void play() {
        System.out.println("Play " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading video..." + fileName);
    }
}

class BlackandWhiteVideo implements Playable {

    private String fileName;

    public BlackandWhiteVideo(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
        System.out.println("Play black and white video: " + fileName);
    }
    @Override
    public void play() {
        System.out.println("Play " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading video..." + fileName);
    }

}

class ProxyVideo implements Playable {

    private ColorVideo video;
    private String fileName;
    private BlackandWhiteVideo video2;
    private String type ;

    public ProxyVideo(String fileName, String type){
        this.fileName = fileName;
        this.type = type;
    }

    public void getType(String movieType){
        if("color".equals(movieType)){
            video = new ColorVideo(fileName);
            System.out.println("The movie is color");
        }
        if("black and white".equals(movieType)){
            video2 = new BlackandWhiteVideo(fileName);
            System.out.println("The movie is black and white");
        }
    }

    @Override
    public void play() {
        getType(type);
        video.play();
    }
}