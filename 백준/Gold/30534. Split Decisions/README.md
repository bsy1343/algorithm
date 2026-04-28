# [Gold III] Split Decisions - 30534

[문제 링크](https://www.acmicpc.net/problem/30534)

### 성능 요약

시간 제한: 6 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 38, 정답: 12, 맞힌 사람: 12, 정답 비율: 57.143%

### 분류

자료 구조, 브루트포스 알고리즘, 집합과 맵

### 문제 설명

<p>A Split Decisions puzzle is a type of crossword in which each across and down answer is a pair of words instead of a single word (as in standard crossword puzzles).  Each pair of words are identical except in exactly two adjacent positions for which letters have been provided in the puzzle -- these sets of letters serve as the clue for the pair of words. In the left half of Figure K.1, the letter pairs &ldquo;IN&rdquo; and &ldquo;CR&rdquo; are given, and the words &ldquo;SINEW&rdquo; and &ldquo;SCREW&rdquo; can be used to solve that clue. The right half of the figure shows a typical Split Decisions puzzle.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/30534.%E2%80%85Split%E2%80%85Decisions/ce733d97.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/30534.%E2%80%85Split%E2%80%85Decisions/ce733d97.png" data-original-src="https://upload.acmicpc.net/90321414-09c0-4168-9636-c11052b942a6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 445px; height: 199px;" /></p>

<p style="text-align: center;">Figure K.1: A small Split Decisions puzzle, with an example solved clue.</p>

<p>While we could ask you to solve a given Split Decisions puzzle, we&#39;ve decided on a slightly different task for you.  Given a list of words, we want you to find pairs of words which could be used in a Split Decisions puzzle.  Specifically, each pair must differ in <strong>exactly</strong> two consecutive letters AND be the only possible pair of words that work for those sets of letters (i.e., no other pair of words in the list of words solve that clue).</p>

<p>For example, if your list of words contained the words CELL, GULL, GUSH, HALL, and HASH, you could make two clues: <code>[CE/GU]_ _</code> (for the answer pair CELL/GULL) and <code>[CE/HA]_ _</code> (for the answer pair CELL/HALL).  Note that the clue <code>[GU/HA]_ _</code> has two possible solutions (GULL/HALL and GUSH/HASH) so it should not be considered.</p>

### 입력

<p>The first line contains a positive integer $n$ ($1 \leq n \leq 1\,500$) indicating the number of words in the word list.  This is followed by $n$ lines each containing one word.  Each word consists of uppercase letters and no word has less than $3$ or more than $20$ letters.</p>

### 출력

<p>The number of unique pairs of words in the input for which a valid Split Decisions clue exists.</p>