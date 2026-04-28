# [Gold IV] Consonant Fencity - 15133

[문제 링크](https://www.acmicpc.net/problem/15133)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 103, 정답: 54, 맞힌 사람: 40, 정답 비율: 48.193%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>There are two kinds of sounds in spoken languages: vowels and consonants. Vowel is a sound, produced with an open vocal tract; and consonant is pronounced in such a way that the breath is at least partly obstructed. For example, letters a and o are used to express vowel sounds, while letters b and p are the consonants (e.g. bad, pot).</p>

<p>a vowel (e.g. silly) or as a consonant (e.g. yellow). The letter w, usually used as a consonant (e.g. wet) could produce a vowel after another vowel (e.g. growth) in English, and in some languages (e.g. Welsh) it could be even the only vowel in a word.</p>

<p>In this task, we consider y and w as vowels, so there are seven vowels in English alphabet: a, e, i, o, u, w and y, all other letters are consonants.</p>

<p>Let&rsquo;s define the consonant fencity of a string as the number of pairs of consecutive letters in the string which both are consonants and have different cases (lowercase letter followed by uppercase or vice versa). For example, the consonant fencity of a string CoNsoNaNts is 2, the consonant fencity of a string dEsTrUcTiOn is 3 and the consonant fencity of string StRenGtH is 5.</p>

<p>You will be given a string consisting of lowercase English letters. Your task is to change the case of some letters in such a way that all equal letters will be of the same case (that means, no letter can occur in resulting string as both lowercase and uppercase), and the consonant fencity of resulting string is maximal.</p>

### 입력

<p>The only line of the input contains non-empty original string consisting of no more than 10<sup>6</sup> lowercase English letters.</p>

### 출력

<p>Output the only line: the input string changed to have maximum consonant fencity.</p>