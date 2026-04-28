# [Platinum V] Sorting - 12828

[문제 링크](https://www.acmicpc.net/problem/12828)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 91, 정답: 36, 맞힌 사람: 24, 정답 비율: 40.000%

### 분류

다이나믹 프로그래밍, 자료 구조, 정렬, 세그먼트 트리

### 문제 설명

<p>Your friend, Mirek, had some files containing integers. He had to sort integers in each file in ascending order. Mirek is an IT specialist so, of course, he tried to find a command line tool that would do his task. The name of a tool wasn&rsquo;t hard to guess, but it didn&rsquo;t work as Mirek expected &ndash; after sorting the files, he realized that this tool was treating every integer as a string and it sorted them lexicographically. He knew that such a thing could happen, but he was surprised anyway &ndash; these files were still sorted in ascending order.</p>

<p>Now, Mirek wonders how lucky he was and how was even possible that integers from these files could have had same lexicographical and numerical order. Help him satisfy his curiosity.</p>

<p>Given a range of integers [A, B], determine the number of subsets of those integers, that their lexicographical and numerical orders are equal.</p>

### 입력

<p>On the first and only line of input there are two integers A and B (1 &le; A &le; B &le; 10<sup>18</sup> , B &minus; A &le; 10<sup>5</sup>).</p>

### 출력

<p>Output a single line with integer M, where M is the number of subsets of set {A, A+ 1, . . . , B}, which keep specified condition. As the answer may be really big, output it modulo 10<sup>9</sup> + 7.</p>

### 힌트

<p>Those subsets are: &empty;, {98}, {99}, {100}, {101}, {98, 99}, {100, 101}.</p>