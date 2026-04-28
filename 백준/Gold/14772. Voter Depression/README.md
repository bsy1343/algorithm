# [Gold III] Voter Depression - 14772

[문제 링크](https://www.acmicpc.net/problem/14772)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 29, 정답: 13, 맞힌 사람: 11, 정답 비율: 42.308%

### 분류

다이나믹 프로그래밍, 값 / 좌표 압축

### 문제 설명

<p>Fake news is a powerful tool in the context of elections. Typically, the goal in disinformation campaigns is not so much to increase the vote for one&rsquo;s own candidate as to depress the vote for the other side, getting those voters to stay home. The usual approach is to target specific populations with negative messages about their candidate that will exploit their own biases. For example, if one wanted to harm a Democratic presidential candidate, one could plant targeted &ldquo;news&rdquo; stories for the left-leaning wing that appear to confirm pre-conceived notions that the candidate is a war-mongering corporate shill; simultaneously, one could plant &ldquo;news&rdquo; stories for the centrist wing that report on the candidate&rsquo;s socialist leanings.</p>

<p>We model this problem as follows: the voters are located at real-valued locations x<sub>j</sub> (excluding 0), corresponding to the left&ndash;right political spectrum. Voters with negative x<sub>j</sub> will vote for the left candidate, and voters with positive x<sub>j</sub> for the right candidate. Each voter has an initial propensity to vote p<sub>j</sub>. Each fake news story i is characterized by an interval [ℓ<sub>i</sub> , r<sub>i</sub>] and a factor 0 &le; d<sub>i</sub> &le; 1. This means that for each voter located in the interval [ℓ<sub>i</sub> , r<sub>i</sub>], his/her propensity to vote if exposed to the story changes from p<sub>j</sub> to p<sub>j</sub> &middot; d<sub>i</sub> . The campaign must select a set of fake news story to deploy such that no voter is exposed to more than one story. The goal is to maximize the difference between the final sum of propensities of people voting for the right candidate minus the sum of propensities of people voting for the left candidate.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of the data set contains two integers 1 &le; n &le; 200 (the number of voters) and 1 &le; m &le; 50 (the number of fake news stories you have at your disposal).</p>

<p>This is followed by n lines, each describing a voter j with two floating point numbers x<sub>j</sub> , p<sub>j</sub> with &minus;1 &le; x<sub>j</sub> &le; 1 and 0 &le; p<sub>j</sub> &le; 1. Voters will be sorted by non-decreasing x<sub>j</sub>.</p>

<p>Next come m lines, each describing a fake news story i with three floating point numbers ℓ<sub>i</sub> , r<sub>i</sub> , d<sub>i</sub> , satisfying &minus;1 &le; ℓ<sub>i</sub> &le; r<sub>i</sub> &le; 1 and 0 &le; d<sub>i</sub> &le; 1. The news stories will be sorted by non-decreasing r<sub>i</sub> values. To avoid floating point problems, we will guarantee that none of the x<sub>j</sub> will be equal to any ℓ<sub>i</sub> or r<sub>i</sub>.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the maximum difference you can achieve between the total propensity of people voting for the right candidate, minus the total propensity of people voting for the left candidate, rounded to two decimals.</p>

<p>Each data set should be followed by a blank line.</p>