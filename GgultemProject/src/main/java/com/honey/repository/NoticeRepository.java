package com.honey.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.honey.domain.Member;
import com.honey.domain.Notice;

public interface NoticeRepository extends JpaRepository<Notice, Long>{

	List<Notice> findByStopEndDateBeforeAndEnabledIn(LocalDateTime now, List<Integer> statuses);

}
