# [Silver I] Chemical Analysis - 5118

[문제 링크](https://www.acmicpc.net/problem/5118)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 7, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

문자열, 브루트포스 알고리즘, 비트마스킹, 재귀

### 문제 설명

<p>Curiosity is equipped with quite a lot of high-tech hardware in order to perform analysis of Mars surface in location. (It&rsquo;s kind of hard to imagine sending rocks back from Mars.) One of the ways in which scientists try to infer which chemical elements are contained in a particular sample is to heat or burn them, and observe which frequencies of light are emitted. Different elements have characteristic spectra, and one can then see which combinations of elements would produce the observed spectrum.</p>

<p>We model this as follows: there are n possible frequencies, 1 &le; n &le; 100, and m elements that we suspect may occur on Mars (1 &le; m &le; 12). For each of the m elements that could possibly be in the sample, we are told at which frequencies they emit light: this is a bit vector of n zeros or ones. Similarly, the sample is described by such an n-bit vector. We assume that if element i occurs in the sample in any quantity, then all of its frequencies will be observed. If multiple elements produce the same frequency, we of course still observe that frequency &mdash; there is no cancellation. For each sample, you are to determine what is the smallest number of elements that would explain the observed spectrum, if any.</p>

### 입력

<p>The first line contains the number K of data sets. This is followed by K data sets, each of the following form:</p>

<p>The first line contains two integers n,m, the number of frequencies and the number of elements.</p>

<p>This is followed by m + 1 lines. Line i for 1 &le; i &le; m describes the ith element, and is a string of n ones and zeros. Line m + 1 is a string of n ones and zeros describing the sample.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then output the minimum number of elements which together would produce the observed spectrum. If there is no such combination of elements, then output &ldquo;Impossible&rdquo; instead.</p>