# [Gold III] Gun Control - 16150

[문제 링크](https://www.acmicpc.net/problem/16150)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 12, 맞힌 사람: 11, 정답 비율: 57.895%

### 분류

배낭 문제

### 문제 설명

<p>The topic that is currently galvanizing a new generation of students to protest, and hopefully to engage in the political process beyond that, is gun control. Even though a vast majority of Americans favor stricter gun control than the status quo, and despite horrible gun death statistics<sup>3</sup>, gun laws have if anything been weakened over the past 2&ndash;3 decades. One of the main reasons is the disproportionately large influence of the National Rifle Association (NRA). In the past, the NRA mostly represented gun owners, but at this point, it is de facto a lobbying arm for gun manufacturers. It promotes essentially the following reasoning: (1) The second amendment is absolute, and no law should restrict gun ownership. (2) In particular, our member companies have every right to sell guns to criminals and unstable people. (3) Hey, look at all those criminals with guns! You better buy a bunch of guns to protect yourself and your family from them.</p>

<p>Part of the reason the NRA has so much power over politicians is having created a situation where a large fraction of lawmakers (in particular, nearly all Republican lawmakers) is already advocating the NRA&rsquo;s position. This allows them to immediately target individual dissenters with demonizing ad campaigns. Given that they have the resources to unelect almost any individual lawmaker, no individual (or small coalition) dares change their position. If a large fraction of lawmakers were to simultaneously change their position, they would likely be protected by their number and the NRA&rsquo;s lack of resources to attack them. Unfortunately, such a large coalition likely would not be able to agree on a lot of gun control; each of them would have another little thing that would require a compromise. You are to compute what is the minimum total compromise that a coalition can accomplish such that at least one of its members is guaranteed to not be unelected.</p>

<p>More formally, for each of the lawmakers, you are given two numbers: the amount of money the NRA would have to spend to defeat this lawmaker, and the amount of compromise this lawmaker would require. A coalition S of lawmakers is safe if the combined amount of money required to defeat all of them exceeds the NRA&rsquo;s budget. The compromise required from S will be the sum of all their individual compromise levels. You are to find the least amount of compromise that can be achieved by any safe coalition.</p>

<p><sup>3</sup>A large fraction are in fact suicides.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of a data set contains two integers n, B. 1 &le; n &le; 50 is the number of lawmakers, 0 &le; B &le; 1000 is the NRA&rsquo;s budget.</p>

<p>This is followed by n lines, each containing two non-negative integers b<sub>i</sub>, c<sub>i</sub>. b<sub>i</sub> &le; 1001 is the amount of money it would take the NRA to defeat lawmaker i, and c<sub>i</sub> &le; 1001 is the amount of compromise that lawmaker i would require. We guarantee that B &lt; &Sigma;<sub>i</sub>b<sub>i</sub>, so there is a safe coalition.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, on a line by itself, output the minimum amount of compromise that any safe coalition of lawmakers can achieve.</p>

<p>Each data set should be followed by a blank line.</p>