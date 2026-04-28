# [Platinum IV] Circular DNA - 17153

[문제 링크](https://www.acmicpc.net/problem/17153)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 103, 정답: 57, 맞힌 사람: 55, 정답 비율: 54.455%

### 분류

그리디 알고리즘, 누적 합

### 문제 설명

<p>You have an internship with a bioinformatics research group studying DNA. A single strand of DNA consists of many genes, which fall into different categories called gene types. Gene types are delimited by specific nucleotide sequences known as gene markers. Each gene type i has a unique start marker s<sub>i</sub> and a unique end marker e<sub>i</sub>. After many dirty jobs (growing bacteria, cell extraction, protein engineering, and so on), your research group can convert DNA into a form consisting of only the gene markers, removing all the genetic material lying between the markers.</p>

<p>Your research group came up with the interesting hypothesis that gene interpretation depends on whether the markers of some gene types form properly nested structures. To decide whether markers of gene type i form a proper nesting in a given sequence of markers w, one needs to consider the subsequence of w containing only the markers of gene type i (s<sub>i</sub> and e<sub>i</sub>), leaving none of them out. The following (and only the following) are considered to be properly nested structures:</p>

<ul>
	<li>s<sub>i</sub>e<sub>i</sub></li>
	<li>s<sub>i</sub>Ne<sub>i</sub>, where N is a properly nested structure</li>
	<li>AB, where A and B are properly nested structures</li>
</ul>

<p>Given your computing background, you were assigned to investigate this property, but there is one further complication. Your group is studying a specific type of DNA called circular DNA, which is DNA that forms a closed loop. To study nesting in circular DNA, it is necessary to cut the loop at some location, which results in a unique sequence of markers (the direction of reading is fixed by molecular properties). Whether a gene type i forms a proper nesting now also depends on where the circular DNA is cut. Your task is to find the cutting location that maximizes the number of gene types that form a properly nested structure. Figure D.1 shows an example corresponding to Sample Input 1. The indicated cut results in the markers for gene type 1 being properly nested.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17153.%E2%80%85Circular%E2%80%85DNA/cb6053fd.png" data-original-src="https://upload.acmicpc.net/758f59f1-1f21-40e5-8a2d-d16aecf5b0d3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 162px; height: 161px;" /></p>

<p style="text-align: center;">Figure D.1: Illustration of Sample Input 1 with its optimal cutting location.</p>

### 입력

<p>The first line of input contains an integer n (1 &le; n &le; 10<sup>6</sup>), the length of the DNA. The next line contains the DNA sequence, that is, n markers. Each marker is a character c followed by an integer i, where c &isin; {s, e} specifies whether it is a start or an end marker and i (1 &le; i &le; 10<sup>6</sup>) is the gene type of the marker. The given DNA sequence has been obtained from the circular DNA by cutting at an arbitrary location.</p>

### 출력

<p>Output one line with two integers p and m, where p is the cutting position that maximizes the number of different gene types that form a proper nesting, and m is this maximum number of gene types. The DNA is cut just before the p<sup>th</sup> input marker (for instance, the cut shown in Figure D.1 has p = 3). If more than one cutting position yields the same maximum value of m, output the smallest p that does so.</p>