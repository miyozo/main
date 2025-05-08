package jp.kwebs.bookstore.form;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class BookForm {
	private Long id;
	@NotBlank(message="表題を記入してください")
	@Size(max=20, message="20文字以内です")
	private String title;
	@NotNull(message="発行日を記入してください")
	@Past(message="過去の日付を記入してください")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate date;
	@NotNull(message="価格を記入してください")
	@Positive(message="価格は正の値です")
	private Integer price;
	@NotEmpty(message="1つ以上選択してください")
	private List<String> mediaType;


	public BookForm() {}
	
	public BookForm(Long id, String title, LocalDate date, Integer price, List<String> mediaType) {
		this.id = id;
		this.title = title;
		this.date = date;
		this.price = price;
		this.mediaType = mediaType;
	}

	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public LocalDate getDate() {
		return date;
	}
	public Integer getPrice() {
		return price;
	}
	public List<String> getMediaType() {
		return mediaType;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public void setMediaType(List<String> mediaType) {
		this.mediaType = mediaType;
	}
}