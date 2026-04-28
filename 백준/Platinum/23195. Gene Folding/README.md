# [Platinum I] Gene Folding - 23195

[문제 링크](https://www.acmicpc.net/problem/23195)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 71, 정답: 38, 맞힌 사람: 36, 정답 비율: 59.016%

### 분류

그리디 알고리즘, 문자열, 매내처

### 문제 설명

<p>International Cell Processing Company (ICPC) is a world leader in the analysis of genetic sequences. A genetic sequence is a sequence of nucleotides, which in this problem is represented by a string containing only the letters <code>A</code>, <code>C</code>, <code>G</code>, and <code>T</code> in some combination, each letter representing a single nucleotide (<strong>A</strong>denine, <strong>C</strong>ytosine, <strong>G</strong>uanine, and <strong>T</strong>hymine, respectively).</p>

<p>One of the key discoveries made by ICPC is that through a process called Genetically Optimized Organic Folding (GOOF), they can take a genetic sequence and transform it into a simpler one, while preserving many of the properties of the sequence that ICPC wants to analyze.</p>

<p>A single application of GOOF works as follows. Find a point between two adjacent nucleotides in the nucleotide sequence, such that the sequence reads the same from that point in both directions, up until the nearer end of the sequence. For instance, in the sequence <code>ATTACC</code>, there are two such points: <code>AT-TACC</code> and <code>ATTAC-C</code>. Then pick one of these points (say, the first one), and fold the genetic sequence at that point, merging the identical nucleotides (so, in this case the <code>AT</code> and <code>TA</code> would become merged, and the resulting sequence would be <code>CCAT</code> or <code>TACC</code>).</p>

<p>Through repeated application of GOOF, a nucleotide can potentially be made much shorter. However, manually searching for the appropriate folding points is very time-consuming. ICPC reached out to you to write a program that would automate the process of finding the folding points and choosing them so as to obtain the shortest possible genetic sequence from a given input sequence.</p>

### 입력

<p>The input contains a single string s representing the nucleotide sequence to be analyzed. The string consists of characters <code>A</code>, <code>C</code>, <code>G</code>, and <code>T</code> only. The length of s is between 1 and 4 &middot; 10<sup>6</sup>, inclusive.</p>

### 출력

<p>Output the smallest possible length of a sequence obtained from the input by applying GOOF zero or more times.</p>