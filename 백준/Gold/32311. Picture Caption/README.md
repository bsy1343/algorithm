# [Gold V] Picture Caption - 32311

[문제 링크](https://www.acmicpc.net/problem/32311)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 16, 맞힌 사람: 14, 정답 비율: 73.684%

### 분류

그리디 알고리즘, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>The UCF Programming Team Lab (PTL) is located in HEC. The team photos are posted outside this lab. When preparing the caption for a picture, there is always the question of how many names should be listed on each line under the picture.</p>

<p>Given the number of names, number of lines to use for the picture caption, and number of letters in each name, we would like to minimize the length of the longest line in the caption.</p>

<p>Note that the names must appear in the caption in the order of the input, i.e., we don&rsquo;t want to reorder the names. Also note the following common constraints:</p>

<ul>
	<li>No space before the first name on each caption line.</li>
	<li>No space after the last name on each caption line.</li>
	<li>Exactly one space between two consecutive names on each caption line.</li>
</ul>

### 입력

<p>The first input line contains two integers n and k (1 &le; k &le; n &le; 10<sup>5</sup>), indicating (respectively) the number of names and the number of lines to use for the picture caption.</p>

<p>The second input line contains n integers c<sub>i</sub> (1 &le; c<sub>i</sub> &le; 10<sup>4</sup>), representing the number of letters in each name in order.</p>

### 출력

<p>Print the length of the longest line in the caption, keeping in mind that we would like to minimize this value.</p>