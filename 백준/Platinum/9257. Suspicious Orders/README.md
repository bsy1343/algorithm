# [Platinum IV] Suspicious Orders - 9257

[문제 링크](https://www.acmicpc.net/problem/9257)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 9, 맞힌 사람: 8, 정답 비율: 33.333%

### 분류

다이나믹 프로그래밍, 그래프 이론, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>You may have heard about the case of a family that got a surprising visit from the FBI. It turns out that the wife had been using the family computer to search for pressure cookers, while the husband had been looking for backpacks. This was right after the Boston Marathon bombings, which had featured the use of improvised explosives using pressure cookers in backpacks. Naturally, a terrorist trying to evade detection will avoid searching for (or ordering) all materials for an attack directly &mdash; instead, a group of people may distribute the ordering of ingredients among themselves. Trying to detect such activities could be a use for the &ldquo;social connections&rdquo; data from the previous problems.</p>

<p>Here, you will be given a list of all social connections. In addition, you will be given, for each person, the list of items they ordered (or looked at) online. The question is whether there are any cliques<sup>1</sup> of people whose orders together could be used to carry out an attack. To that end, you will be given lists of items that together can be used for an attack. If, say, items {1, 4, 6} together are enough to start an attack, then of course, if the group together buys {1, 2, 4, 6, 9}, that will also do. You are to decide how many such cliques are in your data set that could carry out attacks with what they ordered. (Notice that if one person alone already has all the materials, then each clique containing him also has all the materials, which means that you may count many such cliques. That&rsquo;s correct.)</p>

<p><sup>1</sup>Recall that a clique of people is a set such that each pair of people in this set are connected to each other.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line contains four integers n, m, k, c, separated by spaces. 1 &le; n &le; 20 is the number of people in your network. 1 &le; m &le; 50 is the number of items whose purchases we are tracking, and 0 &le; k &le; 100 is the number of item combinations that can be used for an attack. 0 &le; c &le; 400 is the number of connections in the network.</p>

<p>This is followed by k lines, each describing a combination of materials that can be used for an attack. Each such line contains as its first number an integer s<sub>i</sub>, 1 &le; s<sub>i</sub> &le; m, the number of items this combination contains. This is followed by s<sub>i</sub> integers on the same line, each between 1 and m.</p>

<p>Next come n lines, describing the items that the corresponding person bought. Each such line starts with a number t<sub>j</sub> , 0 &le; t<sub>j</sub> &le; m, which is the number of items person j bought. Then follow t<sub>j</sub> integers between 1 and m, each giving an item.</p>

<p>Finally, there are c lines, each containing two distinct integers between 1 and n, describing a connection between those two people.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the number of different cliques (of one or more person) which could carry out an attack by pooling their materials. This should be followed by an empty line.</p>