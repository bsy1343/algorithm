# [Bronze IV] Reverse - 26546

[문제 링크](https://www.acmicpc.net/problem/26546)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 1679, 정답: 1415, 맞힌 사람: 1343, 정답 비율: 84.625%

### 분류

구현, 문자열

### 문제 설명

<p>In the String class, there exists a function called substring. Your task is to do the opposite of the substring function. Rather than returning a specified substring within the String, you will output the String with the substring taken out.</p>

### 입력

<p>The first line will contain a single integer n that indicates the number of data sets that follow. Each data set will be one line with a string and two integers i and j, separated by spaces. The first int, i, is the start index of the substring to be taken out, and the substring removed extends to index j-1. Thus the length of the substring removed is j-i. You may assume that 0 &le; i &le; j &le; length(string).</p>

### 출력

<p>Output the given string, with the substring taken out specified by the given integers. The output will be n lines, with no leading or trailing white space.</p>