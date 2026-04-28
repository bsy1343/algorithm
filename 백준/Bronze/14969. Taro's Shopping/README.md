# [Bronze II] Taro's Shopping - 14969

[문제 링크](https://www.acmicpc.net/problem/14969)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 213, 정답: 185, 맞힌 사람: 164, 정답 비율: 88.649%

### 분류

수학, 브루트포스 알고리즘, 사칙연산

### 문제 설명

<p>Mammy decided to give Taro his first shopping experience. Mammy tells him to choose any two items he wants from those listed in the shopping catalogue, but Taro cannot decide which two, as all the items look attractive. Thus he plans to buy the pair of two items with the highest price sum, not exceeding the amount Mammy allows. As getting two of the same item is boring, he wants two different items.</p>

<p>You are asked to help Taro select the two items. The price list for all of the items is given. Among pairs of two items in the list, find the pair with the highest price sum not exceeding the allowed amount, and report the sum. Taro is buying two items, not one, nor three, nor more. Note that, two or more items in the list may be priced equally.</p>

### 입력

<p>The input consists of multiple datasets, each in the following format.</p>

<pre>
<em>n</em> <em>m</em>
<em>a</em><sub>1</sub> <em>a</em><sub>2</sub> &hellip; <em>a<sub>n</sub></em></pre>

<p>A dataset consists of two lines. In the first line, the number of items&nbsp;<em>n</em>&nbsp;and the maximum payment allowed&nbsp;<em>m</em>&nbsp;are given.&nbsp;<em>n</em>&nbsp;is an integer satisfying 2 &le;&nbsp;<em>n</em>&nbsp;&le; 1000.&nbsp;<em>m</em>&nbsp;is an integer satisfying 2 &le;&nbsp;<em>m</em>&nbsp;&le; 2,000,000. In the second line, prices of&nbsp;<em>n</em>&nbsp;items are given.&nbsp;<em>a<sub>i</sub></em>&nbsp;(1 &le;&nbsp;<em>i</em>&nbsp;&le;&nbsp;<em>n</em>) is the price of the&nbsp;<em>i</em>-th item. This value is an integer greater than or equal to 1 and less than or equal to 1,000,000.</p>

<p>The end of the input is indicated by a line containing two zeros. The sum of&nbsp;<em>n</em>&#39;s of all the datasets does not exceed 50,000.</p>

### 출력

<p>For each dataset, find the pair with the highest price sum not exceeding the allowed amount&nbsp;<em>m</em>&nbsp;and output the sum in a line. If the price sum of every pair of items exceeds&nbsp;<em>m</em>, output&nbsp;<code>NONE</code>&nbsp;instead.</p>