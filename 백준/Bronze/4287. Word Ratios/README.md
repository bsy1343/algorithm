# [Bronze II] Word Ratios - 4287

[문제 링크](https://www.acmicpc.net/problem/4287)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 497, 정답: 353, 맞힌 사람: 301, 정답 비율: 77.778%

### 분류

수학, 구현, 문자열, 사칙연산

### 문제 설명

<p>Many &lsquo;IQ&rsquo; tests have questions of the form: king : queen :: president : ?, where the &lsquo;correct&rsquo; answer (in USA anyway) is &lsquo;first lady&rsquo;, which says a lot about IQ tests and western culture. Because these tests are so culture laden, psychologists at the University of Northern Southwestland have devised a similar test, based on the positional difference between the letters in the words. Thus a typical problem might be: cat : dog :: emu : ? to which the answer is &lsquo;fah&rsquo; because to go from &lsquo;cat&rsquo; to &lsquo;dog&rsquo; you advance the first letter by 1, the second by 14, and the third by 13. So &lsquo;cat&rsquo; to &lsquo;dog&rsquo; = &lsquo;emu&rsquo; to &lsquo;fah&rsquo;. However, these same psychologists are somewhat arithmetically challenged, so they are never quite sure that they have got the right answer. This is where you come in.</p>

<p>Write a program that will read in triples of words such as the ones above and determine the fourth word according to the rules outlined. Consider that the lower case alphabet wraps around at both ends, i.e. &lsquo;a&rsquo; succeeds &lsquo;z&rsquo; and &lsquo;z&rsquo; precedes &lsquo;a&rsquo;.</p>

### 입력

<p>Input will consist of a series of problems. Each problem will consist of three words on a line (see the definition of a word in the Preamble), separated by single spaces. All the words on a line will be the same length (not more than 20 letters), but words on different lines may be of different lengths. Input will be terminated by a line consisting of a single &lsquo;#&rsquo; character.</p>

### 출력

<p>Output will consist of one line for each line of input consisting of the three words given in the input followed by the &lsquo;answer&rsquo;, all separated by single spaces. Note that the answer must also be a word, i.e. it must be of the same length as the three input words and consist only of lower case letters.</p>