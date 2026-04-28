# [Bronze III] Death Knight Hero - 5013

[문제 링크](https://www.acmicpc.net/problem/5013)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 946, 정답: 641, 맞힌 사람: 609, 정답 비율: 67.817%

### 분류

구현, 문자열

### 문제 설명

<p>There once was a champion of WoW Arthasdk the name he was bestowed He Death Gripped you to his side His Chains of Ice stopped your stride And Obliterates made you say &rdquo;OWW!&rdquo;</p>

<p>But one day our hero got puzzled His Death Grip totally fizzled In his darkest despair He could barely hear &rdquo;OMG NOOB u Chains of Iced than u Death Gripped&rdquo;</p>

### 입력

<p>You are given a recording of the abilities our hero used in his battles.</p>

<p>The first line of input will contain a single integer n (1 &le; n &le; 100), the number of battles our hero played.</p>

<p>Then follow n lines each with a sequence of ki (1 &le; ki &le; 1000) characters, each of which are either &rsquo;C&rsquo;, &rsquo;D&rsquo; or &rsquo;O&rsquo;. These denote the sequence of abilities used by our hero in the i-th battle. &rsquo;C&rsquo; is Chains of Ice, &rsquo;D&rsquo; is Death Grip and &rsquo;O&rsquo; is Obliterate.</p>

### 출력

<p>Output the number of battles our hero won, assuming he won each battle where he did not Chains of Ice immediately followed by Death Grip.</p>