# [Platinum I] Couriers - 10124

[문제 링크](https://www.acmicpc.net/problem/10124)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 678, 정답: 189, 맞힌 사람: 133, 정답 비율: 24.449%

### 분류

무작위화

### 문제 설명

<p>Byteasar works for the BAJ company, which sells computer games. The BAJ company cooperates with many courier companies that deliver the games sold by the BAJ company to its customers. Byteasar is inspecting the cooperation of the BAJ company with the couriers. He has a log of successive packages with the courier company that made the delivery specified for each package. He wants to make sure that no courier company had an unfair advantage over the others.</p>

<p>If a given courier company delivered more than half of all packages sent in some period of time, we say that it dominated in that period. Byteasar wants to find out which courier companies dominated in certain periods of time, if any.</p>

<p>Help Byteasar out! Write a program that determines a dominating courier company or that there was none.</p>

### 입력

<p>The first line of the standard input contains two integers, n and m (1 &le; n,m &le; 500,000), separated by a single space, that are the number of packages shipped by the BAJ company and the number of time periods for which the dominating courier is to be determined, respectively. The courier companies are numbered from 1 to (at most)n.</p>

<p>The second line of input contains n integers, p<sub>1</sub>,p<sub>2</sub>,&hellip;,p<sub>n</sub>(1 &le; p<sub>i</sub> &le; n), separated by single spaces; p<sub>i</sub> is the number of the courier company that delivered the i-th package (in shipment chronology).</p>

<p>The m lines that follow specify the time period queries, one per line. Each query is specified by two integers, a and b (1 &le; a &le; b &le; n), separated by a single space. These mean that the courier company dominating in the period between the shipments of the a-th and the b-th package, including those, is to be determined.</p>

### 출력

<p>The answers to successive queries should be printed to the standard output, one per line. (Thus a total of m lines should be printed.) Each line should hold a single integer: the number of the courier company that dominated in the corresponding time period, or 0 if there was no such company.</p>