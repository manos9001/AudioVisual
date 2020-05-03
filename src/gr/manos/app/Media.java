package gr.manos.app;

public class Media {


    public String filename;
    public String title;
    public String description;
    public String creator;
    public int duration;
    public float size;

    public Media(String filename, String title, String description, String creator, int duration, float size) {
        this.filename = filename;
        this.title = title;
        this.description = description;
        this.creator = creator;
        this.duration = duration;
        this.size = size;
    }

       public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Media{" +
                "filename='" + filename + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", creator='" + creator + '\'' +
                ", duration=" + duration +
                ", size=" + size +
                '}';
    }

}
