# [Gold V] Seal - 18359

[문제 링크](https://www.acmicpc.net/problem/18359)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 22, 맞힌 사람: 22, 정답 비율: 53.659%

### 분류

그리디 알고리즘

### 문제 설명

<p>Bytie found a strange document among his mail today. It was a notification that he had inherited a gigantic amount of money after his uncle Byteasar. The document has multiple impression of the Seal of the Kingdom of Byteotia. Just in case though, Bytie would like to make sure that this is not a scam. To this end, he wants to determine if these are impressions of the legitimate seal.</p>

<p>Bytie knows very well how the Seal of the Kingdom of Byteotia looks. However, these is so much ink on the document he received that it is hard to tell if an overzealous clerk made multiple impressions or if it is a feeble attempt to fool Bytie. Help Bytie by writing a program that, given the impressions on the document and the matrix of the Seal of the Kingdom of Byteotia, determines if the impressions on the document are legitimate.</p>

<p>The Seal of the Kingdom of Byteotia has complex security measures that prevent all of the following: (1) rotating the seal impression, (2) making a seal impression whose part does not appear on the document, and (3) inking any point of the document with more than one seal impression.</p>

### 입력

<p>In the first line of the standard input, there is a single integer q (1 &le; q &le; 10), specifying the number of data sets. The lines that follow describe successive data sets.</p>

<p>In the first line of a single data set description, there are four integers, n, m, a, and b (1 &le; n, m, a, b &le; 1000), separated by single spaces.</p>

<p>The following n lines describe the impressions on the document. Each of these lines contains m characters, each of which is either . (dot) or x. The dot signifies that there is no ink at the respective position of the document, whereas x signifies a trace of ink.</p>

<p>Next, a sample document with a single impression of the Kingdom of Byteotia seal is described, in the same format as the one used for the document received by Bytie, in a lines of b characters, . or x each. You may assume that both impressions, from Bytie&rsquo;s document and the legitimate seal matrix, contain a trace of ink.</p>

<p>In tests worth 44% of the total score, it holds that n, m, a, b &le; 150.</p>

### 출력

<p>Your program should print exactly q lines to the standard output. The i-th of these lines should provide the answer for the i-th data set.</p>

<p>If the document received by Bytie could have been imprinted with the legitimate seal, the answer for the data set should be a single word TAK (Polish for yes). If, on the other hand, the document is a forgery, the answer should be the word NIE (Polish for no).</p>