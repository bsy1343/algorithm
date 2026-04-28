# [Platinum IV] Mađioničar - 25444

[문제 링크](https://www.acmicpc.net/problem/25444)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 68, 정답: 11, 맞힌 사람: 11, 정답 비율: 37.931%

### 분류

애드 혹, 문자열, 두 포인터

### 문제 설명

<p>You might have heard that in his free time, Mr. Malnar does magic. His recent appearance in the famous TV show <em>Penn &amp; Teller: Fool Us</em> took the world by storm. He introduced himself as <em>The Magical Mr. Malnar</em>, pulled off an incredible mentalist trick, and swept everyone off their feet.</p>

<p>He started off by calling up an eager volounteer from the audience and asking them to think of any string of their choice that consists of exactly $N$ letters. He then proceeded to entertain the audience, occasionally glancing at the volounteer, and at the end he declared: &ldquo;the longest sub-palindrome<sup>1</sup> of your string has length $L$&rdquo;. After the volounteer confirmed this is indeed correct, the audience was stunned.</p>

<p>However, observant viewers and close friends of Mr. Malnar suspect this was not mind reading, but a clever selection of words that, when combined with excellent reading of facial expressions, gives away enough information to pull off the trick.</p>

<p>While it seemed like Mr. Malnar was merely fooling around, from time to time he would mention some interval of numbers $[l, r]$, where $1 &le; l &le; r &le; N$ and briefly glance at the volounteer. There are rumors saying he is able to determine whether or not the substring of the volounteer&rsquo;s string that consists of the $l$-th through the $r$-th letter (inclusive) is a palindrome, based on their facial expression alone.</p>

<p>You need to write a program which will confirm that Mr. Malnar, if the rumors are true, was able to gather enough information to determine the longest sub-palindrome of the secret string choosen by the volounteer.</p>

<hr />
<p><sup>1</sup>A <em>palindrome</em> is a string that reads the same backward or forward. A <em>substring</em> of a string is a string made up from the $l$-th through the $r$-rh letter of that string, for some $1 &le; l &le; r &le; N$. A <em>sub-palindrome</em> is a substring which is also a palindrome.</p>

### 입력



### 출력

