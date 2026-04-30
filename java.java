function generateBotResponse(input) {
  input = input.toLowerCase();

  if (input.includes("quiz")) {
    return "📝 Sure! I’ll prepare a quick quiz tailored to your needs. What subject should I focus on?";
  } else if (input.includes("resource")) {
    return "📚 Here are some great resources: \n1. Khan Academy\n2. Coursera\n3. NPTEL Videos.";
  } else if (input.includes("doubt")) {
    return "🤔 Please describe your doubt in detail. I’ll do my best to help!";
  } else if (input.includes("hello") || input.includes("hi")) {
    return "👋 Hey there! How can I assist you in your learning today?";
  } else {
    // Generic fallback response
    return `🔍 You said: "${input}". I'm here to help with quizzes, doubts, or study resources.`;
  }
}
