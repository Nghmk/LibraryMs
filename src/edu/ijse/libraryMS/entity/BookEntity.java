/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.libraryMS.entity;

/**
 *
 * @author heman
 */
public class BookEntity {
    private String BookId;
    private String Title;
    private String Author;
    private String Publisher;
    private String Genre;
    private String Language;
    private int NumberOfPages;

    public BookEntity() {
    }

    public BookEntity(String BookId, String Title, String Author, String Publisher, String Genre, String Language, int NumberOfPages) {
        this.BookId = BookId;
        this.Title = Title;
        this.Author = Author;
        this.Publisher = Publisher;
        this.Genre = Genre;
        this.Language = Language;
        this.NumberOfPages = NumberOfPages;
    }

    /**
     * @return the BookId
     */
    public String getBookId() {
        return BookId;
    }

    /**
     * @param BookId the BookId to set
     */
    public void setBookId(String BookId) {
        this.BookId = BookId;
    }

    /**
     * @return the Title
     */
    public String getTitle() {
        return Title;
    }

    /**
     * @param Title the Title to set
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * @return the Author
     */
    public String getAuthor() {
        return Author;
    }

    /**
     * @param Author the Author to set
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * @return the Publisher
     */
    public String getPublisher() {
        return Publisher;
    }

    /**
     * @param Publisher the Publisher to set
     */
    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    /**
     * @return the Genre
     */
    public String getGenre() {
        return Genre;
    }

    /**
     * @param Genre the Genre to set
     */
    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    /**
     * @return the Language
     */
    public String getLanguage() {
        return Language;
    }

    /**
     * @param Language the Language to set
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * @return the NumberOfPages
     */
    public int getNumberOfPages() {
        return NumberOfPages;
    }

    /**
     * @param NumberOfPages the NumberOfPages to set
     */
    public void setNumberOfPages(int NumberOfPages) {
        this.NumberOfPages = NumberOfPages;
    }

    @Override
    public String toString() {
        return "BookEntity{" + "BookId=" + BookId + ", Title=" + Title + ", Author=" + Author + ", Publisher=" + Publisher + ", Genre=" + Genre + ", Language=" + Language + ", NumberOfPages=" + NumberOfPages + '}';
    }
    

    
}
