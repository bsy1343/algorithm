# [Silver III] Rolling Encryption - 10465

[문제 링크](https://www.acmicpc.net/problem/10465)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 198, 정답: 115, 맞힌 사람: 92, 정답 비율: 56.098%

### 분류

구현, 문자열

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/10465.%E2%80%85Rolling%E2%80%85Encryption/2b7e3cc8.jpg" data-original-src="%EB%B0%B1%EC%A4%80/Silver/10465.%E2%80%85Rolling%E2%80%85Encryption/2b7e3cc8.jpg" data-original-src="https://www.acmicpc.net/upload/images2/snowball.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:139px; width:300px" />You have a sequence of lowercase characters that you want to encrypt.</p>

<p>The first <em>k</em> characters will be encoded as plain-text. All characters after the first <em>k</em> characters will be shifted by the most frequently occuring character that appeared in the previous <em>k</em> characters, with ties broken by the character which occurs first in the alphabet. By &quot;shifted by&quot;, we mean that if <code>c</code> was the most frequently occuring character, the character would be shifted ahead by 3 positions (since <code>c</code> is the third letter of the alphabet), modulo 26 (e.g., <code>b</code> becomes <code>e</code>, and <code>z</code> becomes <code>c</code>).</p>

### 입력

<p>On the first line of input contains <em>k</em> (1 &le; <em>k</em> &le; 10 000). The next line contains <em>c</em> characters (1 &le; <em>c</em> &le; 100 000).</p>

### 출력

<p>One line, containing the encrypted version of the <em>c</em> characters from the input.</p>