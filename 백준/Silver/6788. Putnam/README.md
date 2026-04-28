# [Silver I] Putnam - 6788

[문제 링크](https://www.acmicpc.net/problem/6788)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 18, 맞힌 사람: 14, 정답 비율: 87.500%

### 분류

정렬

### 문제 설명

<p>After your great performance in computing competitions, you have been admitted to the University of Waterloo. In your first term there, full of enthusiasm, and wanting to increase your streak of success in academic competitions, you decide to take part in the Putnam competitiion.</p>

<p>Three months later, you get to know your score. It is very good, so you decide to add it to your CV. However, the released results only include the average rank for each of the attained scores. You think that might not be enough information, and want to include the exact range in which your score falls (i.e. if there are 25 people with scores better than yours, and 3 people tied with you, the range would be 26-29).</p>

<p>Furthermore, you want to build a program that would handle possible future situations in which the range of the scores, as well as the number of contestants, have greatly increased. You also want your program to work even if the scores are not necessarily given to you in order.</p>

### 입력

<p>The first line of the input file will contain an integer N between 1 and 100000, inclusive.</p>

<p>N lines will follow, containing the scores that were attained in the contest, as well as the average rank for each of them. Each of them will contain two numbers, separated by a space. The first number will be between 0 and 3 &lowast; 10<sup>9</sup> , inclusive. It will correspond to a score that was attained in the contest by some people. The second number will be a decimal number between 0 and 3 &lowast; 10<sup>8</sup> specified using the format in the sample input, and it will contain the average rank corresponding to that score.</p>

<p>The last line of the input contains your score in the competition. You may assume that this number appears as the first number in one of the previous N lines.</p>

### 출력

<p>You will output two lines. They will contain the range corresponding to the rank of your score.</p>