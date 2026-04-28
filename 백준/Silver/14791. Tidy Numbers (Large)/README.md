# [Silver I] Tidy Numbers (Large) - 14791

[문제 링크](https://www.acmicpc.net/problem/14791)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 492, 정답: 266, 맞힌 사람: 223, 정답 비율: 57.772%

### 분류

수학, 그리디 알고리즘, 문자열

### 문제 설명

<p>Tatiana likes to keep things tidy. Her toys are sorted from smallest to largest, her pencils are sorted from shortest to longest and her computers from oldest to newest. One day, when practicing her counting skills, she noticed that some integers, when written in base 10 with no leading zeroes, have their digits sorted in non-decreasing order. Some examples of this are 8, 123, 555, and 224488. She decided to call these numbers&nbsp;<em>tidy</em>. Numbers that do not have this property, like 20, 321, 495 and 999990, are not tidy.</p>

<p>She just finished counting&nbsp;<em>all</em>&nbsp;positive integers in ascending order from 1 to&nbsp;<strong>N</strong>. What was the last tidy number she counted?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;lines follow. Each line describes a test case with a single integer&nbsp;<strong>N</strong>, the last number counted by Tatiana.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10<sup>18</sup>.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the last tidy number counted by Tatiana.</p>

### 힌트

<p>Note that the last sample case would not appear in the Small dataset.</p>