# [Bronze III] Ampelmännchen - 11434

[문제 링크](https://www.acmicpc.net/problem/11434)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 605, 정답: 317, 맞힌 사람: 291, 정답 비율: 52.717%

### 분류

수학, 그리디 알고리즘, 사칙연산

### 문제 설명

<p>When you unite two countries, they will typically have their own versions of most things, like road signs, foods, etc. If you basically have one of the countries &ldquo;impose&rdquo; its version on the other, this may feel to the other more like an annexation than a unification of two equals.<sup>3</sup> So you need to be sure to take little bits and pieces of both countries and build a whole that&rsquo;s acceptable to everyone. For instance, East Germans really liked their own versions of pickles and ketchup. In some cases, both sides agree that one country&rsquo;s version is preferable &mdash; for instance, everyone loves the East German &ldquo;Ampelm&auml;nnchen,&rdquo; the traffic signal pedestrian walk sign. It gets harder when each side prefers their own version &mdash; in that case, you need compromises such as &ldquo;We really care about our pickles, so let&rsquo;s keep them, but we like your ketchup almost as much, so we&rsquo;re fine with yours.&rdquo; Here, you will figure out suitable compromises for combining two cultures.</p>

<p>You will be given a list of contentious items, and for each of them how much each of the two countries like each version. You are also given how many people live in each of the two united countries. Your goal is to find out a choice for items that maximizes the total &ldquo;happiness&rdquo; of all people. That is the sum of the happinesses of everyone with all the items you select. For each item (e.g., &ldquo;pickles&rdquo;), you can only choose one of the two versions.</p>

<p><sup>3</sup>Indeed, many East Germans felt that way about the way the unification was carried out, and hence in many cases took a long time to &ldquo;identify&rdquo; with the new country.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of each data set contains three integers n, W, E. 0 &le; n &le; 1000 is the number of contentious items. 0 &le; W, E &le; 10000 are the number of people living in the West and East.</p>

<p>This is followed by n lines, each containing four integers 0 &le; L<sub>w,w</sub>, L<sub>w,e</sub>, L<sub>e,w</sub>, L<sub>e,e</sub> &le; 100. These are, in order: how much the West likes its own version, how much the West likes the East&rsquo;s version, how much the East likes the West&rsquo;s version, and how much the East likes its own version.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the maximum total happiness that can be produced by choosing exactly one version of each product.</p>

<p>Each data set should be followed by a blank line.</p>