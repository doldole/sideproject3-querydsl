package com.doldole.sideproject3querydsl.controller;

import com.doldole.sideproject3querydsl.dto.MemberSearchCondition;
import com.doldole.sideproject3querydsl.dto.MemberTeamDto;
import com.doldole.sideproject3querydsl.entity.Member;
import com.doldole.sideproject3querydsl.repository.MemberJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberJpaRepository memberJpaRepository;

    @GetMapping("/v1/members")
    public List<MemberTeamDto> searchMemberV1A(MemberSearchCondition condition) {
        return memberJpaRepository.search(condition);
    }
}
