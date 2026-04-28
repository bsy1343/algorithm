# [Platinum V] First-Name Basis - 17660

[문제 링크](https://www.acmicpc.net/problem/17660)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 10, 정답: 6, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

자료 구조, 그래프 이론, 그리디 알고리즘, 그래프 탐색, 해시를 사용한 집합과 맵, 이분 매칭, 이분 그래프

### 문제 설명

<p>In order to schedule who walks across the podium when, one typically uses alphabetical order by last name, breaking ties by first name. In order to do so, you first have to figure out which is a student&rsquo;s first and last name. This gets more difficult because (1) in a number of countries/cultures, the order of family and given name is reversed, and (2) even when that&rsquo;s not the case, students who can effortlessly write 10,000-LoC operating systems seem to have serious difficulty determining which of their first and last name to put into which of the two fields labeled &ldquo;First Name&rdquo; and &ldquo;Last Name&rdquo;. In this problem, you will write a program that helps USC&rsquo;s administrators fix the ordering of first and last names.</p>

<p>Specifically, for each of the students, you will be given what he/she entered as their first and last name. Furthermore, you get to assume<sup>1</sup> that each string can serve either as a first name or a last name, but not both. That is, you cannot have one person named &ldquo;Aretha Franklin&rdquo; and another named &ldquo;Franklin Roosevelt&rdquo;, because this would use &ldquo;Franklin&rdquo; as both a first and last name. If two students claimed to have these names, then one of them would have to have reversed his/her names. Given the list of names, you should output the smallest number of students whose claimed names need to be reversed to make all names consistent (i.e., each string is only used as a first name, or only used as a second name), or otherwise output &ldquo;Impossible&rdquo;.</p>

<p><sup>1</sup>not completely realistically</p>

### 입력

<p>The first line is the number 1 &le; K &le; 100 of input data sets, followed by K data sets, each of the following form:</p>

<p>The first line is the number 0 &le; n &le; 1, 000 of students whose names were included. This is followed by n lines, each containing two strings s<sub>i,1</sub>, s<sub>i,2</sub>, separated by some kind of spaces. Each string consists of 1&ndash;30 lowercase letters.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the smallest number of students whose reported first and last names need to be reversed to make the input consistent, or output &ldquo;Impossible&rdquo; if there is no way to accomplish this.</p>

<p>Each data set should be followed by a blank line.</p>