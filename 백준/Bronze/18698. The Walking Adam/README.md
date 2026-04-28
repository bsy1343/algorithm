# [Bronze IV] The Walking Adam - 18698

[문제 링크](https://www.acmicpc.net/problem/18698)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 2251, 정답: 1538, 맞힌 사람: 1457, 정답 비율: 68.532%

### 분류

구현, 문자열

### 문제 설명

<p>Adam has just started learning how to walk (with some help from his brother Omar), and he falls down a lot. In order to balance himself, he raises his hands up in the air (that&rsquo;s a true story), and once he puts his hands down, he falls.</p>

<p>You are given a string, each character represents a step he walks, if that character is &lsquo;U&rsquo; that means his hands are up in this step, if this character is &lsquo;D&rsquo; that means his hands are down and he fell down in this step. Your task is to count how many steps he will walk before falling down for the first time.</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of the input will be a single integer T (1 &le; T &le; 100) representing the number of test cases. Followed by T test cases.</p>

<p>Each test case will consist of a single line, containing a non-empty string of at most 100 characters, and each character is either &lsquo;U&rsquo; or &lsquo;D&rsquo;. The characters from left to right represent Adam&rsquo;s steps in the order he walks them.</p>

### 출력

<p>For each test case print a single line containing the number of steps that Adam will walk before falling down, or the length of the string if he won&rsquo;t fall down.</p>

### 힌트

<p>In the first test case, he falls down after 3 steps.</p>

<p>In the second test case, he falls down before making any steps.</p>

<p>In the third test case, he doesn&rsquo;t fall down at all.</p>