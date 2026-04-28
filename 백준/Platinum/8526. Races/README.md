# [Platinum IV] Races - 8526

[문제 링크](https://www.acmicpc.net/problem/8526)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 42, 정답: 7, 맞힌 사람: 6, 정답 비율: 20.690%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 트리

### 문제 설명

<p>Elections are coming and the mayor of Bytetown decided to organize an athletic competition to increase his odds. Unfortunately there is no athletic stadium in Bytetown, so all parts of the competition will have to be held in the streets. The mayor decided to limit the competition only to running events and asked you for help with planning the troutes.</p>

<p>There are n street junctions and n-1 streets in Bytetown. The streets can be used to travel between any pair of junctions. Every route must start at a junction, lead along several streets and finish at some other junction. The mayor would like to organize as many events simultaneously as possible, so the number of routes should be as large as possible. Due to safety reasons no two routes may have a common junction or street. Moreover not every junction can be used as a starting or ending point of a race.</p>

<p>&nbsp;</p>

### 입력

<p>The first line of the input contains a single integer n (1 &le; n &le; 1,000,000): the number of junctions in Bytetown. The junctions are numbered from 1 to n. The following n-1 lines contain descriptions of the streets; each of them consists of two integers a and b (1 &le; a,b &le; n, a &ne; b), separated by a single space: the numbers of junctions that are endpoints of the street.</p>

<p>The line number n+1 contains one integer m (0 &le; m &le; n): the number of junctions that can serve as a starting or ending point of a race. The last line of the input contains m distinct space-separated numbers: the numbers of those junctions, each in the range [1,n].</p>

### 출력

<p>The first and only line of the output should contain one integer, the maximal possible number of running events that can be held in Bytetown simultaneously.</p>

<p>&nbsp;</p>