# [Silver II] Cap Size - 17659

[문제 링크](https://www.acmicpc.net/problem/17659)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 203, 정답: 44, 맞힌 사람: 37, 정답 비율: 23.418%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p>Picking the right size of your cap is surprisingly difficult. If your cap is too small, it keeps digging into your head, or &mdash; even worse &mdash; you can&rsquo;t even get it over your computer science filled head. And if it is too large, it keeps wiggling, and you know that it will just fall down or be blown away by the wind at the most solemn and important moment. So before committing to a cap size, you tried on several different caps, and recorded how they fit: some might have been too large, some too small, and if you were lucky, one might even have fit perfectly. After trying on some (but maybe not all) caps, you now want to compute how many caps could possibly still fit you perfectly.</p>

### 입력

<p>The first line contains a number 1 &le; K &le; 100, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of a data set contains two integers n, t with 0 &le; t &le; n &le; 100: n is the number of caps that are available, and t is the number you tried on. This is followed by a line with n integers 0 &le; s<sub>i</sub> &le; 1000, giving you the size of the i<sup>th</sup> cap. They will be given in strictly increasing order (which also means that the same cap size never appears twice).</p>

<p>Next are t lines, each with two integers c<sub>i</sub>, f<sub>i</sub>, where 0 &le; c<sub>i</sub> &le; 1000 and &minus;1 &le; f<sub>i</sub> &le; 1. Here, c<sub>i</sub> is the size of the cap you tried on (which will always be a size occuring in the earlier list of all sizes), and f<sub>i</sub> the fit, where f<sub>i</sub> = &minus;1 means it was too large, f<sub>i</sub> = 0 that it fit perfectly, and f<sub>i</sub> = 1 that it was too small.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the number of caps that might still fit you perfectly based on the information you received. If the input claimed that a large cap was too small and a smaller cap was too large, or that two different cap sizes fit perfectly, then output &ldquo;Inconsistent feedback&rdquo; instead.</p>