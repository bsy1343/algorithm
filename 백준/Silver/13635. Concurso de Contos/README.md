# [Silver IV] Concurso de Contos - 13635

[문제 링크](https://www.acmicpc.net/problem/13635)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 102, 정답: 40, 맞힌 사람: 33, 정답 비율: 45.833%

### 분류

구현, 그리디 알고리즘, 문자열, 시뮬레이션

### 문제 설명

<p>Machado gosta muito de escrever. J&aacute; escreveu muitos contos, resenhas, relatos de viagens que fez, al&eacute;m de um pequeno romance. Agora Machado quer participar de um concurso de contos, que tem regras muito r&iacute;gidas sobre o formato de submiss&atilde;o do conto.</p>

<p>As regras do concurso especificam o n&uacute;mero m&aacute;ximo de caracteres por linha, o n&uacute;mero m&aacute;ximo de linhas por p&aacute;gina, al&eacute;m de limitar o n&uacute;mero total de p&aacute;ginas. Adicionalmente, cada palavra deve ser escrita integralmente em uma linha (ou seja, a palavra n&atilde;o pode ser separada silabicamente em duas linhas). Machado quer escrever um conto com o maior n&uacute;mero de palavras poss&iacute;vel, dentro das regras do concurso, e precisa de sua ajuda.</p>

<p>Dados o n&uacute;mero m&aacute;ximo de caracteres por linha, o n&uacute;mero m&aacute;ximo de linhas por p&aacute;gina, e as palavras do conto que Machado est&aacute; escrevendo, ele quer saber o n&uacute;mero m&iacute;nimo de p&aacute;ginas que seu conto utilizaria seguindo as regras do concurso.</p>

### 입력

<p>A primeira linha de um caso de teste cont&eacute;m tr&ecirc;s inteiros N, L e C, que indicam, respectivamente, o n&uacute;mero de palavras do conto de Machado, o n&uacute;mero m&aacute;ximo de linhas por p&aacute;gina e o n&uacute;mero m&aacute;ximo de caracteres por linha. O conto de Machado &eacute; inovador e n&atilde;o cont&eacute;m nenhum caractere al&eacute;m de letras mai&uacute;sculas e min&uacute;sculas e espa&ccedil;os em branco, sem letras acentuadas e sem cedilha. A segunda linha cont&eacute;m o conto de Machado, composto de N palavras separadas por espa&ccedil;os em branco; h&aacute; espa&ccedil;o em branco somente entre duas palavras, e entre duas palavras h&aacute; exatamente um espa&ccedil;o em branco.</p>

<p>Restri&ccedil;&otilde;es</p>

<ul>
	<li>2 &le; N &le; 1000</li>
	<li>1 &le; L &le; 30</li>
	<li>1 &le; C &le; 70</li>
	<li>1 &le; comprimento de cada palavra &le; C</li>
</ul>

### 출력

<p>Para cada caso de teste imprima uma &uacute;nica linha, contendo um &uacute;nico n&uacute;mero inteiro, indicando o n&uacute;mero m&iacute;nimo de p&aacute;ginas que o conto de Machado ocupa, considerando as regras do concurso.</p>