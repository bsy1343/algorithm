# [Gold II] Hidden Anagrams - 13402

[문제 링크](https://www.acmicpc.net/problem/13402)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 337, 정답: 128, 맞힌 사람: 111, 정답 비율: 46.250%

### 분류

자료 구조, 문자열, 집합과 맵, 트리를 사용한 집합과 맵, 해싱

### 문제 설명

<p>An anagram is a word or a phrase that is formed by rearranging the letters of another. For instance, by rearranging the letters of &ldquo;William Shakespeare,&rdquo; we can have its anagrams &ldquo;I am a weakish speller,&rdquo; &ldquo;I&rsquo;ll make a wise phrase,&rdquo; and so on. Note that when A is an anagram of B, B is an anagram of A.</p>

<p>In the above examples, differences in letter cases are ignored, and word spaces and punctuation symbols are freely inserted and/or removed. These rules are common but not applied here; only exact matching of the letters is considered.</p>

<p>For two strings s<sub>1</sub> and s<sub>2</sub> of letters, if a substring s&#39;<sub>1</sub> of s<sub>1</sub> is an anagram of a substring s&#39;<sub>2 </sub>of s<sub>2</sub>, we call s&#39;<sub>1</sub> a hidden anagram of the two strings, s<sub>1</sub> and s<sub>2</sub>. Of course, s&#39;<sub>2 </sub>is also a hidden anagram of them.</p>

<p>Your task is to write a program that, for given two strings, computes the length of the longest hidden anagrams of them.</p>

<p>Suppose, for instance, that &ldquo;anagram&rdquo; and &ldquo;grandmother&rdquo; are given. Their substrings &ldquo;nagr&rdquo; and &ldquo;gran&rdquo; are hidden anagrams since by moving letters you can have one from the other. They are the longest since any substrings of &ldquo;grandmother&rdquo; of lengths five or more must contain &ldquo;d&rdquo; or &ldquo;o&rdquo; that &ldquo;anagram&rdquo; does not. In this case, therefore, the length of the longest hidden anagrams is four. Note that a substring must be a sequence of letters occurring consecutively in the original string and so &ldquo;nagrm&rdquo; and &ldquo;granm&rdquo; are not hidden anagrams.</p>

### 입력

<p>The input consists of a single test case in two lines.</p>

<pre>
s<sub>1</sub>
s<sub>2</sub></pre>

<p>s<sub>1</sub> and s<sub>2</sub> are strings consisting of lowercase letters (a through z) and their lengths are between 1 and 4000, inclusive.</p>

### 출력

<p>Output the length of the longest hidden anagrams of s<sub>1</sub> and s<sub>2</sub>. If there are no hidden anagrams, print a zero.</p>