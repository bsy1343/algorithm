# [Silver I] Substring Characters - 21166

[문제 링크](https://www.acmicpc.net/problem/21166)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 54, 정답: 41, 맞힌 사람: 30, 정답 비율: 81.081%

### 분류

자료 구조, 문자열, 브루트포스 알고리즘, 집합과 맵, 해시를 사용한 집합과 맵, 두 포인터

### 문제 설명

<p>The set of distinct characters in a string is referred to as the generalized period of the string. &nbsp;As an example, the generalized period of the string &quot;<code>aabbabb</code>&quot; is {&#39;<code>a</code>&#39;,&#39;<code>b</code>&#39;}</p>

<p>A proper substring is a contiguous substring that is contained in a string and is not the string itself. So &quot;<code>aabbabb</code>&quot; is not a proper substring of the above example.</p>

<p>A minimal proper substring is one that can have no character removed from either end and still have the same generalized period. &quot;<code>aabb</code>&quot; is a proper substring of the example, but it is not minimal. &quot;<code>ab</code>&quot; is minimal.</p>

<p>Unique means that multiple occurrences of the same minimal proper substring in a string are only to be counted once. In the example, &quot;<code>ab</code>&quot; appears twice, but is counted once---hence the number of proper minimal unique substrings with the same generalized period of the entire string is two: &quot;<code>ab</code>&quot; and &quot;<code>ba</code>&quot;.</p>

<p>Your team is to write a program to count the number of proper minimal unique substrings of a given string that have the same generalized period as the string itself.&nbsp;</p>

### 입력

<p>Input to your program is a series of lines terminated by end-of-file. Each line is a test case consisting of alphanumeric characters (a--z, A--Z, 0--9). &nbsp;Upper-case and lower-case letters are distinct. &nbsp;The new line character is not part of the test case string. &nbsp;No test case string will exceed $80$ characters. There will be at most $100$ test strings in input.</p>

### 출력

<p>For each input line print a line containing the number of proper minimal unique substrings of the input string with no leading or trailing whitespace and no extra leading signs or zeros.</p>