# [Platinum I] Hard Choice - 8294

[문제 링크](https://www.acmicpc.net/problem/8294)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 32, 정답: 10, 맞힌 사람: 8, 정답 비율: 44.444%

### 분류

그래프 이론, 자료 구조, 분리 집합, 오프라인 쿼리, 단절점과 단절선

### 문제 설명

<p>Byteasar has always been experiencing problems with making decisions. Each time he travels through Bytetown and knows that there are at least two totally different possible routes, it takes him ages to decide on a particular one. Byteasar has recently heard about roadworks that are planned in Bytetown. He is maybe the only person in town who is glad to hear this: there is a chance that road closures will ease his pain of making decisions.</p>

<p>In Bytetown there are n junctions connected with m bidirectional streets. Two routes connecting a given pair of junctions are called totally different if they share no common streets. Such routes may, however, lead through common junctions.</p>

<p>Byteasar is eagerly tracking the road closures. At first he was able to check whether there exist at least two totally different routes connecting given pairs of junctions, but at some point updating such data became hard for him. Could you write a program that will help him with this problem?</p>

### 입력

<p>The first line of input contains three integers n, m and z (2 &le; n &le; 100,000, 1 &le; m, z &le;&nbsp;100,000) denoting the number of junctions and the number of streets in Bytetown, and the number of events, respectively. The junctions are numbered 1 through n.</p>

<p>The following m lines contain descriptions of streets, each consisting of two integers a<sub>i</sub>, b<sub>i</sub> (1 &le;&nbsp;a<sub>i</sub>, b<sub>i</sub> &le; n, a<sub>i</sub> &ne; b<sub>i</sub>). Such a pair represents a bidirectional street connecting the junctions a<sub>i</sub> and b<sub>i</sub>. Each pair of junctions is connected with at most one street.</p>

<p>The following z lines contain descriptions of events, each description consists of a letter t<sub>i</sub> and two integers c<sub>i</sub>, d<sub>i</sub> (t<sub>i</sub> &isin; {Z, P}, 1 &le;&nbsp;c<sub>i</sub>, d<sub>i</sub> &le; n, c<sub>i</sub> &ne; d<sub>i</sub>). The events are listed chronologically. An event with t<sub>i</sub> = Z denotes a closure of the street connecting junctions c<sub>i</sub> and d<sub>i</sub>. You can assume that such street exists and that it has never been closed before. Note that the roadworks may be performed in a chaotic manner - in particular, at some point all streets in Bytetown may become closed! On the other hand, an event with t<sub>i</sub> = P denotes that Byteasar would like to travel between junctions c<sub>i</sub> and d<sub>i</sub> and therefore he would like to know if he can do this in at least two totally different ways (he may use only the streets that have not been closed yet).</p>

### 출력

<p>Output a single line for each event of type P, in the same order as the events appear in the input. If there are two routes connecting the given pair of junctions leading through disjoint sets of streets, output the word TAK (i.e., yes in Polish). Otherwise, output NIE (no in Polish). You may assume that the output will not be empty.</p>