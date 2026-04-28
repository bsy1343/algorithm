# [Gold III] Cherry Picking - 5154

[문제 링크](https://www.acmicpc.net/problem/5154)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>There was a point in time when the idea of insurance was that everyone would pay money into a joint pool, so that there would be enough money to cover one or a few individuals in case of a calamity they could not themselves afford. Of course, as participation increased, administration became more complex and more and more rules had to be created. Eventually, it was argued that such administration would be much more efficiently performed by private companies with an interest in obtaining profits. But of course, once you have a private insurance company trying to maximize profits, you get very different goals: for instance, a company will have the least interest to include those people who will need insurance the most: elderly people or patients with pre-existing conditions. It appears that it is even legal for companies to terminate policies of individuals who have paid their premiums for a long time when those individuals develop chronic (and expensive) conditions. The phenomenon of only trying to insure the most profitable individuals is also known as &ldquo;cherry picking&rdquo;. Here, we&rsquo;ll try to develop a program to pick cherries well.</p>

<p>You will be given a list of n patients belonging to C categories, such as &ldquo;male, 18&ndash;30&rdquo;, &ldquo;female, 25&ndash;40&rdquo;, etc. For each individual, you will also be told what is the maximum they can afford per year for their health insurance premium, and how much money you will likely have to spend on them per year for benefits. You will be allowed to set a premium p<sub>c</sub> for each of the categories c. Then, among the individuals in category c, those who cannot afford the premium will simply go elsewhere. The others, who can afford p<sub>c</sub>, will pay you p<sub>c</sub> per year, but you have to pay their benefits in return. Your goal is now to judiciously set the values to maximize your profit. However, the government is looking over your shoulder, and requiring that you insure at least a total of m people. So your pricing must be such that you also meet that requirement.</p>

### 입력

<p>The first line contains the number K of data sets. This is followed by K data sets, each of the following form:</p>

<p>The first line of each data set contains three integer numbers n, C, m. 1 &le; n &le; 1000 is the number of individuals, 1 &le; C &le; 30 the number of categories, and m &le; n the government&rsquo;s requirement for minimum number of insured people.</p>

<p>This is followed by n lines, each describing one individual i with three integers c<sub>i</sub>, p<sub>i</sub>, b<sub>i</sub>. 1 &le; c<sub>i</sub> &le; C is the category that individual i falls into; p<sub>i</sub> &ge; 0 is the maximum that individual i can pay for his/her premiums, and b<sub>i</sub> &ge; 0 is the amount of benefits that he/she will be receiving.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the next line, output the maximum profit you can make by setting one premium per category and insuring at least m people. Each data set should be followed by one empty line.</p>