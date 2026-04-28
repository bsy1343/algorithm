# [Gold III] Complex Integer Solutions - 22636

[문제 링크](https://www.acmicpc.net/problem/22636)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 10, 맞힌 사람: 7, 정답 비율: 20.000%

### 분류

수학, 정수론

### 문제 설명

<p>Let&nbsp;<i>f</i>(<i>x</i>) =&nbsp;<i>a</i><sub>0</sub>&nbsp;+&nbsp;<i>a</i><sub>1</sub><i>x</i>&nbsp;+&nbsp;<i>a</i><sub>2</sub><i>x</i><sup>2</sup>&nbsp;+ ... +&nbsp;<i>a<sub>d</sub>x<sup>d</sup></i>&nbsp;be the function where each&nbsp;<i>a<sub>i</sub></i>&nbsp;(0 &le;&nbsp;<i>i</i>&nbsp;&le;&nbsp;<i>d</i>) is a constant integer (and&nbsp;<i>a<sub>d</sub></i>&nbsp;is non-zero) and&nbsp;<i>x</i>&nbsp;is a variable. Your task is to write a program that finds all&nbsp;<i>complex integer solutions</i>&nbsp;of the equation&nbsp;<i>f</i>(<i>x</i>) = 0 for a given&nbsp;<i>f</i>(<i>x</i>). Here, by complex integers, we mean complex numbers whose real and imaginary parts are both integers.</p>

### 입력

<p>The input consists of two lines. The first line of the input contains&nbsp;<i>d</i>, the degree of&nbsp;<i>f</i>(<i>x</i>). The second line contains (<i>d</i>&nbsp;+ 1) integers&nbsp;<i>a</i><sub>0</sub>, ... ,&nbsp;<i>a<sub>d</sub></i>, the coeffcients of the equation. You may assume all the following: 1 &le;&nbsp;<i>d</i>&nbsp;&le; 10, |<i>a<sub>i</sub></i>| &le; 10<sup>6</sup>&nbsp;and&nbsp;<i>a<sub>d</sub></i>&nbsp;&ne; 0.</p>

### 출력

<p>There should be two lines in the output. In the first line, print the number&nbsp;<i>m</i>&nbsp;of complex integer solutions. In the second line, print&nbsp;<i>m</i>&nbsp;solutions separated by space. Each solution should be counted and printed exactly once even if it is a multiple root. The solutions should be printed in ascending order of their real parts then their imaginary parts, and in the following fashion:&nbsp;0,&nbsp;-2,&nbsp;i,&nbsp;-3i,&nbsp;2+i, and&nbsp;3-4i.</p>