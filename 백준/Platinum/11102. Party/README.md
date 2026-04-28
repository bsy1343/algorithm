# [Platinum III] Party - 11102

[문제 링크](https://www.acmicpc.net/problem/11102)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 74, 정답: 35, 맞힌 사람: 27, 정답 비율: 56.250%

### 분류

이분 탐색, 최대 유량, 구현, 시뮬레이션, 그래프 이론

### 문제 설명

<p>Kjell Bratbergsengen, head of the computer science department, is concerned about the small number of girls studying computer science at NTNU. Representatives from Norwegian software companies complain constantly, but Kjell believes that the most dangerous possible effect of this problem is low overall recruitment in the future. It is well known that geeks usually do not have parents who studied at Dragvoll, and Kjell wants to do all he can to make sure his current students gets the opportunity to reproduce with decent partners.</p>

<p>While considering how to cope with this problem, Kjell remembers how things were when he studied at Gl&oslash;shaugen. He recalls a lot of cute nurse students. It was not always easy to connect with them, as they were usually more interested in medical doctors than geeks, but charming young Kjell had his share of success nonetheless. Kjell believes that todays students also have a chance, and decides to arrange a party. Some male students already have girlfriends, but Kjell wants to make sure that all the single students get a date for the party as well. He tries to recruit nurse students, but realizes that it is impossible to get the number he needs, and many of them are picky about who they want date. How can he get a date for all the single geeks?</p>

<p>After some thinking, he comes up with the solution: He can just arrange several parties with the same girls! It is expensive to arrange parties, so there should be as few as possible. Even though Kjell is a talented programmer, he is now very busy with administrative chores, and needs your help writing a program which decides the minimum number of parties he will have to host.</p>

### 입력

<p>The input has n &le; 200 cases, and the first line consists of a positive integer giving n. The first line for each test case consists of two positive integers separated by a single space, m &le; 100 and f &le; 50, where m denotes the number of male students who need a date, and f the number of nurse students available.</p>

<p>Then follow f lines. Line number i represents nurse number i. The line starts with a positive integer giving the number of male students she is willing to date. Then follows a list of space separated unique integers naming these geeks. The male students are numbered from 0 to m &minus; 1.</p>

### 출력

<p>Output one line for each test case. If it is impossible to make sure all male students get a date, no matter how many parties Kjell arranges, output a line with the text &ldquo;impossible&rdquo;. Otherwise output a line with a single integer giving the minimum number of parties needed to make sure all male students can attend a party with a date.</p>