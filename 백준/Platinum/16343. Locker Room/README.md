# [Platinum I] Locker Room - 16343

[문제 링크](https://www.acmicpc.net/problem/16343)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 512 MB

### 통계

제출: 56, 정답: 19, 맞힌 사람: 16, 정답 비율: 34.783%

### 분류

자료 구조, 그리디 알고리즘, 문자열, 세그먼트 트리, 집합과 맵, 느리게 갱신되는 세그먼트 트리, 접미사 배열과 LCP 배열

### 문제 설명

<p>There are several strange rooms in Binary Casino and one of them is a locker room. You have to enter the locker room several times a day, two times being a minimum (before and after your shift). There is no key or access code needed to enter the locker room. There is a brand new security lock system instead.</p>

<p>The lock system presents you with a generated puzzle which you have to solve every time you want to enter the locker room. This system prevents possible intruders to enter the locker room, as the puzzle takes them a long time to solve. Only employees, after working in the casino for some time, manage to master the puzzle.</p>

<p>It is your second week in the casino and you have already been late three times because you didn&rsquo;t manage to solve the puzzle quickly enough. You therefore decided to write a program which solves the puzzle. The puzzle is as follows:</p>

<p>You are given a cyclic string of N lowercase english letters. You have to choose and mark substrings (continuous segments of characters) of a given length K until each character in the string is marked. Marking a substring does not change the original string and each character can be marked multiple times. The task is to print the lexicographically maximal substring among chosen substrings. In addition, the printed substring has to be lexicographically minimal possible.</p>

<p>For example, let &ldquo;acdb&rdquo; be the given string of length N = 4 and let K = 3. Then you can choose substrings &ldquo;acd&rdquo; and &ldquo;bac&rdquo; to mark the whole string. The puzzle solution is &ldquo;bac&rdquo;.</p>

### 입력

<p>The first line of input contains two integers N and K (1 &le; N &le; 5 &middot; 105, 1 &le; K &le; N), describing the length of the given string and the length of marked substrings. The second line contains N lowercase english letters &ndash; the given cyclic string.</p>

### 출력

<p>Output the lexicographically maximal substring among chosen substrings under the condition the result is lexicographically minimal possible.</p>