package com.te.fiegnclientproject.dto;

import java.io.Serializable;
import java.time.LocalDateTime;



import com.fasterxml.jackson.annotation.JsonFormat;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@SuppressWarnings("serial")
public class BookDto implements Serializable {

	    
	    private Integer bookId;
	  
	   
	    private String bookName;

	   
	   
	    private String bookAuthor;

	   
	  
	    private String publishedBy;

	  
	    private String bookDescription;

	    private String bookImageUrl;

	   
	    private Integer bookCount;

	    
	    private Integer userId;

	    private Integer rentId;

	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = "Asia/Kolkata")
	    private LocalDateTime publishedDate;

	    private double bookRentPerHour;
}
