# [Platinum II] SLICICE - 2940

[문제 링크](https://www.acmicpc.net/problem/2940)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 45, 정답: 13, 맞힌 사람: 12, 정답 비율: 35.294%

### 분류

최대 유량, 그래프 이론

### 문제 설명

<p>After their pool burst, Mirko and Slavko started collecting cards. In their neighbourhood, card collection is taken seriously and there are strict rules for the purchase and trading of cards.</p>

<p>Purchasing cards is always done by two children together. Each of them gives half the required funds and two cards are bought. Then they race to the fountain downtown, the winner getting both cards. If they arrive at the exact same time, each of them gets one of the cards.</p>

<p>At first the rules performed okay, but soon accusations started that some kids could not have acquired their cards only through such purchases.</p>

<p>One day all the children met to figure out if there were irregularities. They managed to agree on the exact number of cards each of them currently has. They also made a partial list of who went to the store with whom, but they do not know who won any of the races and took the cards on those occasions.</p>

<p>Write a program that determines who participated in all purchases that were made and who won the subsequent races so that after all the purchases, the cards counts correspond to the given counts. Assume that before any purchases, the children had no cards.</p>

<p>If there are multiple possible solutions, output any of them.&nbsp;</p>

### 입력

<p>The first line contains the integers N and M (1 &le; N &le; 100, 0 &le; M &le; 1000), the number of children and the number of purchases they recall. The children are labeled 1 through N.</p>

<p>The second line contains N integers, the number of cards each child currently has.</p>

<p>The following M lines contain two integers each, the labels of the children who made the purchase.&nbsp;</p>

### 출력

<p>On the first line, output the total number of purchases.</p>

<p>Each of the following lines should describe one purchase. The description of a purchase consists of three numbers: the labels of children that made the purchase and the number 0, 1 or 2, how many cards the first child got after the race.</p>

<p>Note: A solution will always exist, although not necessarily unique. The total number of purchases will be at most 1000.&nbsp;</p>

### 힌트

<p>In the first example, there are only two children, labeled 1 and 2. The first child should end up with five cards, the second with one.</p>

<p>After the first purchase, each of the children got one card.</p>

<p>After the second and third purchases, the first child got both cards both times.</p>