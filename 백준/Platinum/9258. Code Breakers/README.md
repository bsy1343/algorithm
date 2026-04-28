# [Platinum V] Code Breakers - 9258

[문제 링크](https://www.acmicpc.net/problem/9258)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 69, 정답: 40, 맞힌 사람: 24, 정답 비율: 72.727%

### 분류

수학, 정수론, 분할 정복을 이용한 거듭제곱, 모듈로 곱셈 역원, 오일러 피 함수, 확장 유클리드 호제법

### 문제 설명

<p>It is almost certain that the NSA is intercepting and logging, and probably analyzing, much of the e-mail traffic in the world, and certainly in the US. One way in which organizations and individuals try to protect the privacy of their messages is by encrypting, and one of the cooler ideas in encryption is public key encryption. The rough idea is as follows: You publish one key, which means that everyone can see it and use it to encrypt a message to you. But to decrypt it, you need a different key, which only you have. While this looks like a really nice idea, the fact that it is actually mathematically possible is the really big contribution, which was made in the RSA algorithm<sup>2</sup>.</p>

<p>Here is how it works: you choose two prime numbers p, q (typically randomly, but that doesn&rsquo;t matter for this problem). Your public key (which everyone can see) consists of the number n = p &middot; q and a small number e. Your private key (which only you should know) consists of a number d &le; (p &minus; 1)(q &minus; 1) such that (d &middot; e) mod ((p &minus; 1)(q &minus; 1)) = 1. If you know p, q, then it&rsquo;s pretty easy to find such a d; if not, it seems difficult; that&rsquo;s why only you (the owner of p, q) can decrypt the message.</p>

<p>Now, how to encrypt and decrypt a message. Let&rsquo;s say that our message is a number m. (We can always convert any string to a number by reading its bits as a number.) Then, the encrypted version is c = m<sup>e</sup> mod n (which can be computed knowing just n and e). To decrypt, the recipient computes c<sup>d</sup> mod n, which recovers the original message.</p>

<p>To break someone&rsquo;s key, it would be enough to be able to factor n and recover p, q. It is believed (though not proved) that this is generally hard, so long as p and q are large enough (thousands of digits). If they are too small, then using brute force, you can break RSA. That&rsquo;s what you&rsquo;ll do here.</p>

<p><sup>2</sup>The &lsquo;A&rsquo; stands for Adleman, which is our very own Len Adleman at USC.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each consisting of a single line of the following form:</p>

<p>The line contains three integers n, e, c, separated by spaces. You can assume that 5 &le; n &le; 1, 000, 000, 000, 1 &le; e &le; 10, 000, 1 &le; c &lt; n. (In other words, we assume that the NSA knows the public key and the encrypted message.) In our inputs, n will always be a product of exactly two primes.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the decrypted version m of the message c on a line by itself, followed by an empty line.</p>