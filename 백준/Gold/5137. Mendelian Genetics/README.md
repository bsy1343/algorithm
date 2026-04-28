# [Gold II] Mendelian Genetics - 5137

[문제 링크](https://www.acmicpc.net/problem/5137)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 9, 맞힌 사람: 9, 정답 비율: 90.000%

### 분류

자료 구조, 우선순위 큐, 정렬

### 문제 설명

<p>The Austrian monk Gregor Mendel (1822&ndash;1884) was known as the founding father of genetics thanks to his pioneering theory of genotypic inheritance, which, together with Darwin&rsquo;s theory of evolution and natural selection,<sup>1</sup> revolutionized the whole field of biology. In this problem you are to help Mendel speed up his time-consuming experiments in his farms.</p>

<p>One day in the 1860s Mendel was working on his now-famous plant hybridization experiments where he tried to hybridize different types of peas. For simplicity, we only consider one feature of peas: their size. If Mendel started with n initial types of peas, each with a different size, he would get n<sup>2</sup> hybridized types after the first generation. His goal was to optimize the size (the larger the better) by repeated hybridization so that after many generations, he might obtain a breed that produces very large peas. However, to cultivate all these n<sup>2</sup> candidates might be infeasible as it requires too many resources in terms of time, land, and energy when n is huge. As a matter of fact, due to funding cuts at his abbey, Mendel could only afford to grow n among the n<sup>2</sup> candidates. How would he choose the n most promising candidates, i.e. the hybrids with the highest likelihoods of producing larger sizes? Well, without knowing the (hidden) genotypes of the n initial types, the only thing he can do is guess the size of the hybrid type based on phenotype, i.e. the sizes of the two parent types. Let&rsquo;s assume he used the very simple formula \(\left \lceil {(x + y)/2} \right \rceil\) to calculate the estimated size of the hybrid of two parents of sizes x and y. For example, if the two parents have sizes 5 and 2, we guess the hybrid will most likely have a size of 4.</p>

<p>Your job is find the largest n sizes in this matrix of n &times; n combinations.</p>

<p><sup>1</sup>Darwin (1809&ndash;1882) was, like most of his contemporaries, completely unaware of Mendel&rsquo;s results, which were only rediscovered and popularized posthumously in the early 20th century. Had Darwin read Mendel&rsquo;s papers, history of science would have been very different.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line contains an integer 1 &le; n &le; 10000, the number of initial types.</p>

<p>The second line contains n positive integers, the sizes of the initial types.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the next line output n integers, in sorted order, which are the largest n numbers from the matrix of n &times; n combinations. Each data set should be followed by a blank line.</p>