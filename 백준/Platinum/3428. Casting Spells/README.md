# [Platinum II] Casting Spells - 3428

[문제 링크](https://www.acmicpc.net/problem/3428)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 433, 정답: 77, 맞힌 사람: 47, 정답 비율: 17.407%

### 분류

문자열, 매내처

### 문제 설명

<p>Casting spells is the least understood technique of dealing with real life. Actually, people find it quite hard to distinguish between a real spells like &ldquo;abrahellehhelleh&rdquo; (used in the battles and taught at the mage universities) and screams like &ldquo;rachelhellabracadabra&rdquo; (used by uneducated witches for shouting at cats).</p>

<p>Finally, the research conducted at the Unheard University showed how one can measure the power of a word (be it a real spell or a scream). It appeared that it is connected with the mages&rsquo; ability to pronounce words backwards. (Actually, some singers were burned at the stake for exactly the same ability, as it was perceived as demonic possession.) Namely, the power of a word is the length of the maximum subword of the form ww<sup>R</sup>ww<sup>R</sup> (where w is an arbitrary sequence of characters and w<sup>R</sup> is w written backwards). If no such subword exists, then the power of the word is 0. For example, the power of abrahellehhelleh is 12 as it contains hellehhelleh and the power of rachelhellabracadabra is 0. Note that the power of a word is always a multiple of 4.</p>

<p>The input contains several test cases. The first line of the input contains a positive integer Z &le; 40, denoting the number of test cases. Then Z test cases follow, each conforming to the format described in section Input. For each test case, your program has to write an output conforming to the format described in section&nbsp;Output.</p>

### 입력

<p>The input is one line containing a word of length at most 3 &middot; 10<sup>5</sup>, consisting of (large or small) letters of the English alphabet.</p>

### 출력

<p>You should output one integer k being the power of the word.</p>