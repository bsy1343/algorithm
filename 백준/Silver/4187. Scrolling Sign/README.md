# [Silver V] Scrolling Sign - 4187

[문제 링크](https://www.acmicpc.net/problem/4187)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 128, 정답: 70, 맞힌 사람: 64, 정답 비율: 56.140%

### 분류

구현, 문자열

### 문제 설명

<p>Electric scrolling signs are often used for advertising. A given sign displays exactly&nbsp;<i>k</i>&nbsp;characters. When the sign is switched on, all of the character positions are initially empty (showing spaces). In each time interval, all of the characters on the sign are shifted to the left by one position, and a new character is added at the right-most position. The character that was in the left-most position moves off the sign.</p>

<p>For certain sequences of words, it is possible to reuse characters from one word to form a subsequent word. For example, on a sign with three character positions, the sign can display the message CAT ATE TED by scrolling in the five characters CATED.</p>

<p>The advertiser has a specific message to show using the sign. The faster the message is displayed, the more people will be able to see the whole message. Therefore, your job is to find a way to display all the words of the message by scrolling in the smallest number of letters. In between showing the words of the message, the sign may display other words that are not considered part of the message. However, the words of the message must be shown in the order in which they are given.</p>

### 입력

<p>The first line of input contains a single integer&nbsp;<i>n</i>, the number of test cases to follow. Each test case starts with a line containing a two integers,&nbsp;<i>k</i>, the number of character positions on the sign, and&nbsp;<i>w</i>, the number of words in the message. Each of the two integers is between 1 and 100, inclusive. The following&nbsp;<i>w</i>&nbsp;lines each contain a word of the message comprising exactly&nbsp;<i>k</i>&nbsp;uppercase letters.</p>

### 출력

<p>For each test case, output a line containing a single integer, the minimum number of letters that must be scrolled into the sign so that it displays all the words of the message.</p>