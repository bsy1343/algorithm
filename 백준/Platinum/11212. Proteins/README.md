# [Platinum V] Proteins - 11212

[문제 링크](https://www.acmicpc.net/problem/11212)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 9, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Magnus is a biologist. He is playing with proteins all day long and now he wants to know what these molecules look like. He has heard that X-ray crystallography can be used to get images of proteins that contain a lot of sulfur atoms. Magnus does not think his proteins contain enough sulfur, but he is willing to change them to get this to work. Magnus has bacteria producing his proteins for him, and he is planning to mutate these bacteria to change the proteins.</p>

<p>Magnus knows the DNA strings coding his proteins and how the DNA is translated into the amino-acid sequence making up the protein. The first three letters in the code determine the first amino acid, the following three letters determine the second, and so on. Whenever those three letters are ATG (in that order) the amino acid methionine will be incorporated into the protein. Methionine contains a sulfur atom, so Magnus wants to have many methionines in his proteins. Magnus can only change the DNA code by inserting letters. This, however, takes a lot of time for each letter he wants to insert. Knowing that you are good at computer stuff, he asks you for help. Can you figure out the smallest number of letters that need to be inserted into the DNA code to make it code for n methionines?</p>

<p>For example, the DNA string TGATGC codes for no methionines, but adding an A in the beginning turns it into ATGATGC which has two ATG blocks and thus codes for two methionines. This is the first sample input and a solution to the second sample input is shown in the figure below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11212.%E2%80%85Proteins/66b0874f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/11212.%E2%80%85Proteins/66b0874f.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11212/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:227px; width:310px" /></p>

### 입력

<p>The first line of input contains a single positive integer n &le; 10<sup>6</sup>, the number of methionines to be included in the protein. The second line contains a non-empty DNA string of at most 1000 letters, each either A, T, G, or C.</p>

### 출력

<p>Output a single integer, the smallest number of letters that can be inserted into the DNA string to make at least n of its three-letter blocks be ATG.</p>