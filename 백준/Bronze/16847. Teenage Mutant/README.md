# [Bronze II] Teenage Mutant - 16847

[문제 링크](https://www.acmicpc.net/problem/16847)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 161, 정답: 138, 맞힌 사람: 119, 정답 비율: 87.500%

### 분류

구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>In common parlance, a &ldquo;mutant&rdquo; is an individual with a very unusual deformity, or &mdash; for some superheros &mdash; power. To biologists, it simply describes an accidental change in genetic information from a parent to a child. Telling mutation from inheritance is complicated a bit by the fact that some genetic traits are recessive, and may not be expressed for a generation, but then be visible later. Thus, to see whether a trait is really a mutation, you might have to go some generations back.</p>

<p>That&rsquo;s what you&rsquo;ll do here. You will get expressed traits for yourself and a number of your ancestors, described as strings of length n. A trait is a &ldquo;mutant trait&rdquo; if your value in that position is different from that of all your ancestors. You are to compute what fraction of your traits are mutant traits, i.e., how much of a mutant you are.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of each data set contains two integers n, k, with 1 &le; n &le; 100, 1 &le; k &le; 100. This is followed by n + 1 lines of exactly k uppercase letters each. The first of those n + 1 lines is a description of your traits, and the remaining n lines each give you the string for one of your ancestors.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number.</p>

<p>Then, output the fraction of traits in which you are a mutant. Do not reduce the fraction; for example, if you are a mutant in two out of ten traits, write &ldquo;2/10&rdquo;, not &ldquo;1/5&rdquo; or &ldquo;0.2&rdquo;.</p>

<p>Each data set should be followed by a blank line.</p>