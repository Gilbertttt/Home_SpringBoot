package Book.Package;

public class Book {
    private String title;
    private Integer numOfPages;
    private String author;
    private Integer id;
    private String published;

    //Constructors
        public Book (String title, Integer numOfPages, String author, Integer id, String published) {
            this.title = title;
            this.numOfPages = numOfPages;
            this.author = author;
            this.id = id;
            this.published = published;
        }

    public String getTitle () {
            return title;
    }
    public Integer getNumOfPages () {
            return numOfPages;
    }
    public String getAuthor () {
            return author;
    }
    public Integer id() {
            return id;
    }
    public String getPublished() {
            return published;
    }

       public void setTitle(String title){
            this.title = title;
        }
        public void setNumOfPages(Integer numOfPages) {
            this.numOfPages = numOfPages;
        }

        public void setId(Integer id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublished(String published) {
            this.published = published;
    }
}

