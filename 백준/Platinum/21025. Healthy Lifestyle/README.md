# [Platinum III] Healthy Lifestyle - 21025

[문제 링크](https://www.acmicpc.net/problem/21025)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 29, 정답: 22, 맞힌 사람: 18, 정답 비율: 75.000%

### 분류

자료 구조, 그래프 이론, 분리 집합, 단절점과 단절선, 이중 연결 요소

### 문제 설명

<p>Jakarta has N junctions numbered from 1 to N and connected by M (bi-directional) roads, i.e. the road (u, v) is the same as the road (v, u). There is at most one road connecting any two different junctions and there is a sequence of roads connecting any junction to any other junctions. The local government is planning to hold a jogging event to promote a healthy lifestyle to its citizen. A jogging track consists of a series of junctions starting from junction s and ending at a different junction t such that there exists a road connecting any adjacent junctions in the track, e.g., s &rarr; v<sub>1</sub> &rarr; v<sub>2</sub> &rarr; &middot; &middot; &middot; &rarr; v<sub>k</sub> &rarr; t. Note that it is possible that a jogging track only uses one road, e.g., s &rarr; t. Also, a junction can appear multiple times in a jogging track, e.g., s &rarr; x &rarr; y &rarr; x &rarr; t, or s &rarr; t &rarr; x &rarr; t.</p>

<p>Of course, in such an event, the roads used in the chosen jogging track must be closed from any vehicle. Although the event only lasts for one day, these roads closure might hurt the economy badly. So, the local government has to make sure that there is an alternative track from junction s to junction t which does not share any common road with the jogging track. On the other hand, sharing a common junction in both tracks is not an issue.</p>

<p>Your task in this problem is to determine for each query s and t, whether there exist at least two different tracks (one is for the jogging track while the other is for the alternative track) from junction s to junction t which do not share any common road.</p>

<p>For example, s &rarr; a &rarr; b &rarr; t and s &rarr; b &rarr; c &rarr; t do not share any common road. The roads used in the first track are: (s, a), (a, b), and (b, t); while the roads used in the second track are: (s, b), (b, c), and (c, t). However, s &rarr; a &rarr; b &rarr; t and s &rarr; b &rarr; a &rarr; t do share a common road, i.e. the road connecting junction a and junction b.</p>

### 입력

<p>Input begins with a line containing three integers: N M Q (1 &le; N &le; 100 000; 0 &le; M &le; 100 000; 1 &le; Q &le; 100 000) representing the number of junctions, the number of roads, and the number of queries respectively. The next M lines each contains two integers: u v (1 &le; u &lt; v &le; N) representing a (bi-directional) road connecting junction u and junction v. There is at most one road connecting any two different junctions and there is a sequence of roads connecting any junction to any other junctions. The next Q lines each contains two integers: s t (1 &le; s &lt; t &le; N) representing a query.</p>

### 출력

<p>For each query in the same order as input, output in a line &ldquo;<code>YES</code>&rdquo; (without quotes) or &ldquo;<code>NO</code>&rdquo; (without quotes) whether there are two different tracks which do not share any common road from junction s to junction t.</p>