# [Platinum II] Mosaic Mansion - 17806

[문제 링크](https://www.acmicpc.net/problem/17806)

### 성능 요약

시간 제한: 12 초, 메모리 제한: 512 MB

### 통계

제출: 122, 정답: 33, 맞힌 사람: 23, 정답 비율: 25.275%

### 분류

해싱, 중간에서 만나기

### 문제 설명

<p>A mosaic is a picture made from square tiles arranged in a grid, at least for today&rsquo;s purposes.</p>

<p>We would like to make a mosaic with exactly the same number of tiles of each colour. We will do this by taking an existing design and removing some of the rows from it.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/57d5adee-be99-4b94-91c0-443540da4465/-/preview/" style="width: 617px; height: 239px;" /></p>

<p style="text-align: center;">Figure M.1: Illustration of a solution to Sample Input 1. The three rows annotated with white can be kept, giving 6 of each colour of tile.</p>

<p>What is the greatest number of rows we can keep?</p>

### 입력

<ul>
	<li>The first line of input contains the number of rows, n (1 &le; n &le; 40), the number of columns, m (1 &le; m &le; 10<sup>5</sup>), and the number of colours, c (1 &le; c &le; 10<sup>5</sup>) in the mosaic respectively.</li>
	<li>Each of the next n lines contains m colours of cells p<sub>1</sub> . . . pm (1 &le; p &le; c).</li>
</ul>

### 출력

<p>Output the greatest number of rows that can be kept while keeping equal representation for each colour in the input, or 0 if no rows can be kept.</p>