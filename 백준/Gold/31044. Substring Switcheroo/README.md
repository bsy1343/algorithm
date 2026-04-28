# [Gold IV] Substring Switcheroo - 31044

[문제 링크](https://www.acmicpc.net/problem/31044)

### 성능 요약

시간 제한: 9 초, 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 11, 맞힌 사람: 10, 정답 비율: 47.619%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 슬라이딩 윈도우, 집합과 맵

### 문제 설명

<p>You and your young daughter have been playing a game to help teach her how to read. She of course loves learning her letters, rearranging them, and asking with each rearrangement, &lsquo;what does this spell?&rsquo; Much of the time the letters are nonsense, but sometimes they form a real word.</p>

<p>She is interested in forming really <em>long</em> words, and as such, you have been constructing very long strings of run-together words. She then takes them and adds some letters, removes others, and generally rearranges the letters so that they form something that may be completely different.</p>

<p>You start writing down the strings before and after your daughter has changed them. The question is: what is the largest portion of the original string that was preserved after she edited it, allowing rearrangement of the letters?</p>

<p>For example, if the original string you wrote was <code>fourscoreandsevenyearsago</code>, she might have shuffled all of the letters to make <code>ogasraeynevesdnaerocsruof</code>. The second string is just a rearrangement of the first, so the entire original string was in some way preserved.</p>

<p>However, if she removes the <code>y</code> and adds a <code>z</code> and rearranges the letters again, the string might become <code>reedcuraanonzovresafoegss</code>, and the longest substring of the original that is still a (rearranged) substring in the result is <code>ears</code> (which is rearranged to <code>resa</code> in her version).</p>

<p>Write a program that takes as input two strings: the original one you constructed $A$, and your daughter&rsquo;s edited version $B$. Find and report the longest substring of $A$ that is a permutation of some substring of $B$. If there are multiple substrings of $A$ that satisfy this criterion with the same length, output the one that appears first in $A$.</p>

### 입력

<p>Input starts with a line containing an integer $1 \leq n\leq 10$, indicating the number of test cases. Following this are $2n$ lines, each pair representing one test case. The first line of each test case is $A$, the second is $B$. Each string contains between $1$ and $1\, 000$ characters, and uses only the lowercase letters <code>a</code>&ndash;<code>z</code>. Within each test case, the two strings have the same length.</p>

### 출력

<p>Output the longest substring of $A$ that is a permutation of some substring of $B$. If there are multiple longest matches, print the one that occurs earliest in $A$. If there are none, print <code>NONE</code>.</p>