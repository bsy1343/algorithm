# [Gold II] Alien Microwave - 21585

[문제 링크](https://www.acmicpc.net/problem/21585)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 36, 정답: 22, 맞힌 사람: 20, 정답 비율: 62.500%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>A standard microwave is operated by entering the cooking time as a string in the form of <code>hhmmss</code>, where <code>hh</code>, <code>mm</code>, and <code>ss</code> are two-digit integers less than 24, 60, and 60, respectively. Leading zeros in the string <code>hhmmss</code> are omitted. For example, the cooking time of 3 minutes is entered as <code>300</code>, though <code>0300</code> or <code>00300</code> is also accepted.</p>

<p>When any of <code>hh</code>, <code>mm</code>, or <code>ss</code> exceeds the limit, the microwave will not accept it as a valid cooking time and gives an error. For example, <code>75</code> is not accepted, nor is <code>240000</code>. Note that for the purpose of this problem, we assume that zero seconds of cooking time (represented by a sequence of zero or more <code>0</code>&rsquo;s) is valid.</p>

<p>Sometimes, one might make a mistake by omitting a digit while entering the cooking time. For example, while entering <code>1030</code> (10 minutes and 30 seconds), omitting the digit <code>3</code> turns the input time into <code>100</code> (1 minute) instead. Omitting the digit <code>1</code> turns it into <code>030</code> (30 seconds). In this case, omitting any of the four digits will still make the resulting string a valid cooking time. However, some other strings, while valid cooking times themselves, can become invalid when <em>exactly</em> one of the digits is omitted. For example, <code>1700</code> (17 minutes) becomes invalid if either of the zeros is omitted. Such strings are called <em>Error-Prone</em> cooking times.</p>

<p>Now, imagine some extraterrestrial planet, on which a standard microwave is operated by a string in the form $a_1a_2a_3 \dots a_n$, where each of $a_1, a_2, \dots , a_n$ is a two-digit non-negative integer (somehow they also use base 10) less than limits $t_1, t_2, \dots , t_n$, respectively. The rules of valid and invalid cooking time still hold.</p>

<p>Given limits $t_1, t_2, \dots , t_n$, find the number of <em>Error-Prone</em> cooking times. Note that leading zeros don&rsquo;t change the cooking time, so a time specification like <code>066</code> is the same as <code>66</code>, and should not be counted twice. Also note that <code>0</code> is a legitimate cooking time.</p>

### 입력

<p>The first line of input contains an integer $n$ ($1 \le n \le 9$), which is the number of time types in the alien time scheme.</p>

<p>Each of the next $n$ lines contains an integer $t_i$ ($1 \le t_i \le 100$), which is the number of partitions in the $i$<sup>th</sup> time type in the alien scheme.</p>

### 출력

<p>Output a single integer, which is the number of <em>Error-Prone</em> cooking times without leading zeros.</p>