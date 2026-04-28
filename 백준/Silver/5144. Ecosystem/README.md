# [Silver IV] Ecosystem - 5144

[문제 링크](https://www.acmicpc.net/problem/5144)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 85, 정답: 59, 맞힌 사람: 29, 정답 비율: 58.000%

### 분류

수학, 구현, 사칙연산, 시뮬레이션

### 문제 설명

<p>When you read about environmental disasters such as the gulf oil spill, you frequently see mention of the damage to the &ldquo;ecosystem&rdquo; in the region (in the case of the Gulf of Mexico often with the adjective &ldquo;fragile&rdquo; in front of it). One can associate a number of different things with this term, but one dimension is that many different animals and plants depend on each other for survival (or population control), and introducing oil into the food chain could have all kinds of side effects. For instance, even if it didn&rsquo;t affect Seymour directly, it might kill a lot of zooplankton, so the herrings wouldn&rsquo;t have enough to eat, and in turn, there wouldn&rsquo;t be enough food for Seymour. In turn, the squids might like this, because fewer seals means fewer predators. Here, you are to calculate the overall effect on the ecosystem.</p>

<p>We model this as follows: there are n species. Each species only eats species lower on the food chain, which means species with lower numbers. For each species, you will be given the initial number of members remaining after some of them have died directly because of the oil. Furthermore, you will be given their diet: how many members of each of the other species one member needs to eat to survive. That is supposed to describe a &ldquo;balanced diet&rdquo;: for instance, if we determine that a seal needs to eat a herring and a squid per day, then substituting two herrings and half a squid, or 10 squids, is not sufficient. If the supply of one or more of the food sources is already depleted, then the remaining members of the higher species starve and die (much to the delight of their other prey). For the purpose of this problem, to avoid complication, you will process the species in increasing order. For instance, if both seals (e.g., species 5) and dolphins (e.g., species 12) need herring in their diet, and the seals have eaten all the remaining herrings, then all the dolphins will die.</p>

<p>You are to output the number of surviving members of the species</p>

### 입력

<p>The first line contains the number K of data sets. This is followed by K data sets, each of the following form:</p>

<p>The first line contains an integer 1 &le; n &le; 100, the number of species.</p>

<p>This is followed by n lines, with line i describing species i, by giving i integer numbers. The first number is the current population of species i. This is followed by i &minus; 1 integers, giving the number of members of species 1, 2,... ,i &minus; 1 which a member of species i needs to eat to survive.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then output the number of members of the species (one per line) which survive after one unit of time compared to the starting configuration. Each data set should be followed by a blank line.</p>